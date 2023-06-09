SUMMARY = "Driver for ZyDAS ZD1211, ZyDAS ZD1211B, Atheros AR5007UG"
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS:${PN} = " \
    kernel-module-zd1211rw \
    firmware-zd1211 \
    "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY:${PN} = "1"
