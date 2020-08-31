# You can leave all these object instantiations in a single file
# that you will import in your main file through a simple "import"
# instruction following the definition of your classes.

central_BLV = Line("Bellville via Lavistown", "blue", "90")
# six other lines have to be defined here


# instantiating train stations
cpt = Station("Cape Town", "CPT", [northern_MTV, northern_MUT, central_BLV, central_KPT, central_CHN, southern, cape_flats])

esp = Station("Esplanade", "ESP", [northern_MTV, central_BLV, central_CHN])
yst = Station("Ysterplaat", "YST", [northern_MTV, central_BLV, central_CHN])
mut = Station("Mutual", "MUT", [central_BLV, central_CHN, northern_MUT])
lng = Station("Langa", "LNG", [central_BLV, central_KPT, central_CHN])
btw = Station("Bonteheuwel", "BTW", [central_BLV, central_KPT, central_CHN])
lvs = Station("Lavistown", "LVS", [central_BLV])
blh = Station("Belhar", "BLH", [central_BLV])
uni = Station("Unibell", "UNI", [central_BLV])
pen = Station("Pentech", "PEN", [central_BLV])
srp = Station("Sarepta", "SRP", [central_BLV])

blv = Station("Bellville", "BLV", [northern_MTV, northern_MUT, central_BLV])

sto = Station("Stock Road", "STO", [central_CHN])
nya = Station("Nyanga", "NYA", [central_KPT, central_CHN])
ppi = Station("Philippi", "PPI", [central_KPT, central_CHN])

ret = Station("Retreat", "RET", [southern, cape_flats])
koe = Station("Koeberg Road", "KOE", [central_KPT, northern_MUT, cape_flats])
mai = Station("Maitland", "MAI", [central_KPT, northern_MUT, cape_flats])


wsk = Station("Woodstock", "WSK", [central_KPT, northern_MUT, southern, cape_flats])
slt = Station("Salt River", "SLT", [central_KPT, northern_MUT, southern, cape_flats])

wol = Station("Woltemade", "WOL", [northern_MUT])
ttn = Station("Thornton", "TTN", [northern_MUT])
gdw = Station("Goodwood", "GDW", [northern_MUT])
vas = Station("Vasco", "VAS", [northern_MUT])
els = Station("Elsies Rivier", "ELS", [northern_MUT])
prw = Station("Parow", "PRW", [northern_MUT])
tyg = Station("Tygerberg", "TYG", [northern_MUT])

# add here the definition of all other stations in the network of interest
