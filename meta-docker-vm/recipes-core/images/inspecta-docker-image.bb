require recipes-core/images/petalinux-image-minimal.bb
DESCRIPTION = "docker-vm custom image"
LICENSE = "MIT"

IMAGE_INSTALL_append = " docker docker-ce-contrib nano python3-docker-compose"
IMAGE_INSTALL_append = " iptables"
IMAGE_INSTALL_append = " tcpdump"
IMAGE_INSTALL_append = " crit-docker-init"

# Add extra space (in KB) for Docker images (10Gib)
IMAGE_ROOTFS_EXTRA_SPACE = "10485760"
