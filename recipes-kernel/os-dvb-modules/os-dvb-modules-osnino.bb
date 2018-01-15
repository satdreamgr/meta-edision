KV = "4.8.17"
SRCDATE = "20180115"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "719f411a31a41f7686e0d8c28c7ae239"
SRC_URI[sha256sum] = "207557c07dfcb46c232a33f2db3b003bbb28ab98277dfbdc6f75280474f59a89"
