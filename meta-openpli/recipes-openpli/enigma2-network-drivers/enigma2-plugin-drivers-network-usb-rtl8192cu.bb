SUMMARY = "new universal rt18xxx kernel driver"
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS:${PN} = " \
    ${@bb.utils.contains("MACHINE_FEATURES", "linuxwifi", "kernel-module-rtl8192cu", "rtl8192cu", d)} \
    firmware-rtl8192cu \
    firmware-rtl8192cufw \
    "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY:${PN} = "1"
