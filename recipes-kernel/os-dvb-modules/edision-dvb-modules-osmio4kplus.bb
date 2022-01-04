KV = "5.12.0"
SRCDATE = "20210511"
MODNAMES = "brcmstb-${MACHINE} brcmstb-decoder ci avl6261 avl6862 si2183"

RRECOMMENDS_${PN} += "linux-firmware-dvb-fe-avl62x1 linux-firmware-dvb-fe-avl68x2"

require os-dvb-modules.inc

COMPATIBLE_MACHINE = "osmio4kplus"

SRC_URI[md5sum] = "3907bb6c98c606243cf6915039b0d3d0"
SRC_URI[sha256sum] = "f79a14d5229a86df188d87ec71d3bb630a8ee376309acb84efce137834eccbf8"
