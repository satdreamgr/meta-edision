require linux-os.inc

PR = "r1"

SRC_URI = "http://source.mynonpublic.com/edision/linux-edision-${PV}.tar.xz \
	file://defconfig \
	file://0001-Support-TBS-USB-drivers-for-4.6-kernel.patch \
	file://0001-TBS-fixes-for-4.6-kernel.patch \
	file://0001-STV-Add-PLS-support.patch \
	file://0001-STV-Add-SNR-Signal-report-parameters.patch \
	file://blindscan2.patch \
	file://0001-stv090x-optimized-TS-sync-control.patch \
	"

COMPATIBLE_MACHINE = "osnino"

SRC_URI[md5sum] = "10eb489d6d34213451ae808f55f449da"
SRC_URI[sha256sum] = "21a2db8e25d8eab13674cc45f8b102d7fa126b950648a02590daef4ff4c00f4c"
