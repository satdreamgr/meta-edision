KV = "4.8.17"
SRCDATE = "20170920"
MODNAMES = "linuxdvb"

require os-dvb-modules.inc

SRC_URI = "http://source.mynonpublic.com/edision/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

COMPATIBLE_MACHINE = "osnino"

RDEPENDS_${PN}_remove = "firmware-mn8847x"

SRC_URI[md5sum] = "4835cc3be6e63cb23dd4071dfc85b24c"
SRC_URI[sha256sum] = "7f68b2b58535dbc90a164e160675c7d7be36b555bfc1a7ef6cc2a12397965058"
