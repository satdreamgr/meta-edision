KV = "4.8.17"
SRCDATE = "20180406"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "9da1ce74524901bc66a428e0714b4211"
SRC_URI[sha256sum] = "75c870e0630b68e6fe80521442ab32df2764e55b56c93f84a1bf4f3f61503014"
