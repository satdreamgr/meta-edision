DESCRIPTION = "GLES/EGL files for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES = "virtual/libgles2 virtual/egl"

SRC_URI = "https://github.com/edision-open/edision-gl/releases/download/v${PV}/libv3d-${PV}.tar.xz"

INSANE_SKIP_${PN} = "ldflags"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT  = "1"

S = "${WORKDIR}/libv3d"

LIBV3DARCH ?= ""
LIBV3DARCH_arm = "arm-linux-gnueabihf"
LIBV3DARCH_aarch64 = "aarch64-linux-gnu"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install() {
	install -m 0755 -d ${D}${libdir}
	oe_soinstall ${S}/lib/${LIBV3DARCH}/libv3dplatform.so.${PV} ${D}${libdir}
	oe_soinstall ${S}/lib/${LIBV3DARCH}/libv3ddriver.so.${PV} ${D}${libdir}
	ln -s libv3ddriver.so.${PV} ${D}${libdir}/libEGL.so
	ln -s libv3ddriver.so.${PV} ${D}${libdir}/libGLESv2.so
	install -m 0755 -d ${D}/${includedir}
	install -m 0644 ${S}/include/v3dplatform.h ${D}${includedir}
	for d in EGL GLES GLES2 GLES3 KHR; do
		install -m 0755 -d ${D}${includedir}/$d
		for f in ${S}/include/$d/*.h; do
			install -m 0644 $f ${D}${includedir}/$d
		done
	done
}
