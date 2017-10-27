KV = "4.8.17"
SRCDATE = "20171027"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

SRC_URI = "http://source.mynonpublic.com/edision/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "42bed4babfd6ed54291f51a86c5dc580"
SRC_URI[sha256sum] = "5426f16b9e47cc6822483b0a11db74bdfdbdb824f3985b681aa81417ad937f24"
