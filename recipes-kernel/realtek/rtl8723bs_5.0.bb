SUMMARY = "Driver for Realtek 8723BS wireless/bluetooth devices"
HOMEPAGE = "http://www.realtek.com/"
SECTION = "kernel/modules"
LICENSE = "GPLv2"
require conf/license/license-gplv2.inc

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "kernel-module-r8723bs firmware-rtl8723bs"

ALLOW_EMPTY_${PN} = "1"
