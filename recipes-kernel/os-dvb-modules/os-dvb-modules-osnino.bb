KV = "4.8.17"
SRCDATE = "20170926"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

SRC_URI = "http://source.mynonpublic.com/edision/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "da8bdf9683d6421fe621f68626160e10"
SRC_URI[sha256sum] = "78f876f2f96c447665951d8a40f913aebc86cace45e4fcbb131de8bd3dd0d74b"
