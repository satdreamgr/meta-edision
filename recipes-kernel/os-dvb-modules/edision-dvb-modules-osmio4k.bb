KV = "5.12.0"
SRCDATE = "20210511"
MODNAMES = "brcmstb-${MACHINE} brcmstb-decoder ci avl6261 avl6862 si2183"

RRECOMMENDS_${PN} += "linux-firmware-dvb-fe-avl62x1 linux-firmware-dvb-fe-avl68x2"

require os-dvb-modules.inc

COMPATIBLE_MACHINE = "osmio4k"

SRC_URI[md5sum] = "d64285b4d0c2c53039e88800f92b00b3"
SRC_URI[sha256sum] = "aafbaa9dddff3ecde454460f29cf739f4892c9f3b90e0bd6cd003e0cf8b5954d"
