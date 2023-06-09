SUMMARY = "rt3573 802.11a/b/g/n 2.4/5 GHz USB Single Chip"
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS:${PN} = " \
    ${@bb.utils.contains("MACHINE_FEATURES", "linuxwifi", "kernel-module-rt2800usb", "rt3573", d)} \
    "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY:${PN} = "1"
