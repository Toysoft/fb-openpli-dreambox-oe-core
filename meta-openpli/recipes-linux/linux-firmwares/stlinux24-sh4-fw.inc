require linux-firmware.inc

SRC_URI = "http://archive.stlinux.com/stlinux/2.4/updates/RPMS/sh4/${STLINUX_FW_FILE_NAME} \
"

INC_PR = "r6"


S = "${WORKDIR}/opt/STM/STLinux-2.4/devkit/sh4/target"

# fix architecture mismatch QA error
INSANE_SKIP:${PN} = "arch"

do_unpack() {
	rpm2cpio.sh ${DL_DIR}/${STLINUX_FW_FILE_NAME} | cpio -di
}

