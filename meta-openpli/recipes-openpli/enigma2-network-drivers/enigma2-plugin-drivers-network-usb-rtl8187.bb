SUMMARY = "WiFi devices for Realtek 802.11a/bg chipsets."
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS:${PN} = " \
    kernel-module-rtl8187 \
    "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY:${PN} = "1"
