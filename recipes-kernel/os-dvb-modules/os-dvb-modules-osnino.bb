KV = "4.8.17"
SRCDATE = "20171114"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

SRC_URI = "http://source.mynonpublic.com/edision/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "80cbfd9cd214b78b98255f4e4cc10be4"
SRC_URI[sha256sum] = "aa32e6eec54f0a0ac77ac3d30c95a7599bb8dd2580628549878170ce0a1e9cc9"
