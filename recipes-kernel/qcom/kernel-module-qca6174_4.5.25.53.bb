SUMMARY = "Qualcomm WiFi driver for QCA module 6174"
LICENSE = "BSD & GPLv2"
LIC_FILES_CHKSUM = "file://Android.mk;md5=235cc8d87e0fb1c956be4af0d07074fb"
CAF_MIRROR = "https://source.codeaurora.org/external/wlan"

inherit module

COMPATIBLE_MACHINE = "osmio4k|osmio4kplus"

SRC_URI = "${CAF_MIRROR}/qcacld-2.0/snapshot/qcacld-2.0-${PV}.tar.gz \
    file://qcacld-2.0-support.patch \
"

SRC_URI[md5sum] = "e6de75ed79be7238fdd0e9fd0bd69100"
SRC_URI[sha256sum] = "97e65f761c395e3f9d93f8b8ebc9b139763f688614f6fa7ad53e381539eb09ed"

S = "${WORKDIR}/qcacld-2.0-${PV}"

do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra
    install -m 0644 ${S}/wlan.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra

    install -d -m 0755 ${D}${sysconfdir}/modules-load.d
    echo wlan > ${D}${sysconfdir}/modules-load.d/wlan.conf
}

python do_package_prepend() {
    d.prependVar('PKGV', '-')
    d.prependVar('PKGV', d.getVar("KERNEL_VERSION", True).split("-")[0])
}

FILES_${PN} += "${sysconfdir}/modules-load.d/wlan.conf"
