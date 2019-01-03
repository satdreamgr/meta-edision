SUMMARY = "Firmware for mn8847x"
LICENSE = "CLOSED"

inherit allarch

SRC_URI = "file://mn8847x.zip"

S = "${WORKDIR}"

PACKAGES = "${PN}"
FILES_${PN} += "${nonarch_base_libdir}/firmware"

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware
	install -m 0644 mn88472.fw ${D}${nonarch_base_libdir}/firmware
	install -m 0644 mn88473.fw ${D}${nonarch_base_libdir}/firmware
}
