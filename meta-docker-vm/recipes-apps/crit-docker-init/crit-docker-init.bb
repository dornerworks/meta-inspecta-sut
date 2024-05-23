SUMMARY = "Docker Compose init script"
SECTION = "apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += " \
    file://load_start_containers.init \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc5.d
    install -m 0755 ${S}/load_start_containers.init ${D}${sysconfdir}/init.d
    ln -sf ../init.d/load_start_containers.init ${D}${sysconfdir}/rc5.d/S30load_start_containers.init
}
