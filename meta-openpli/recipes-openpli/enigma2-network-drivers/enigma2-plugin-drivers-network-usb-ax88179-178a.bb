SUMMARY = "ASIX AX88179_178A USB 3.0/2.0 Gigabit Ethernet Network Adapter"
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS:${PN} = " \
	kernel-module-usbnet \
    "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY:${PN} = "1"
