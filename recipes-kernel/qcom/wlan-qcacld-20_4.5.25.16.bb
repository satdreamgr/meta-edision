DESCRIPTION = "qcacld-2.0 module.bbclass mechanism."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://Android.mk;md5=235cc8d87e0fb1c956be4af0d07074fb"
CAF_MIRROR = "https://www.codeaurora.org/cgit/external/wlan"

inherit module

COMPATIBLE_MACHINE = "osmio4k"

SRC_URI = "${CAF_MIRROR}/qcacld-2.0/snapshot/qcacld-2.0-${PV}.tar.gz \
    file://qcacld-2.0-support.patch \
"

S = "${WORKDIR}/qcacld-2.0-${PV}"

do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra
    install -m 0644 ${S}/wlan.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra
}

python do_package_prepend() {
    d.appendVar('PKGV', '-')
    d.appendVar('PKGV', d.getVar("KERNEL_VERSION", True).split("-")[0])
}

SRC_URI[md5sum] = "e0e8c8e714923607a2c93a8ddbb2b456"
SRC_URI[sha256sum] = "bec9d86a911d5d90a5bb1c59d53bf4adb7c88cb54ec5ec949b2433622b578479"
