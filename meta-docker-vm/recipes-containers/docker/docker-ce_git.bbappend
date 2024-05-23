SRC_URI += " \
        file://daemon.json \
        file://docker.init \
        "

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

do_install_append() {
     install -m 0644 ${WORKDIR}/daemon.json ${D}${sysconfdir}/docker/daemon.json
}
