import metrorail1

# instantiating train lines
central_BLV = metrorail1.Line("Bellville via Lavistown", "blue", "90")
central_KPT = metrorail1.Line("Kapteinsklip via Pinelands", "blue", "95")
central_CHN = metrorail1.Line("Chris Hani via Esplanade", "blue", "99")
northern_MTV = metrorail1.Line("Bellville via Monte Vista", "green", "2")
northern_MUT = metrorail1.Line("Bellville via Mutual", "green", "3")
cape_flats = metrorail1.Line("Retreat via Athlone", "brown", "05")
southern = metrorail1.Line("Simonstown", "red", "02")

# global variable containing all the lines in a list:
network_lines = [central_BLV, central_KPT, central_CHN, northern_MUT, northern_MTV, cape_flats, southern]

# instantiating (creating) train stations
cpt = metrorail1.Station("Cape Town", "CPT", [northern_MTV, northern_MUT, central_BLV, central_KPT, central_CHN, southern, cape_flats])

esp = metrorail1.Station("Esplanade", "ESP", [northern_MTV, central_BLV, central_CHN])
yst = metrorail1.Station("Ysterplaat", "YST", [northern_MTV, central_BLV, central_CHN])
mut = metrorail1.Station("Mutual", "MUT", [central_BLV, central_CHN, northern_MUT])
lng = metrorail1.Station("Langa", "LNG", [central_BLV, central_KPT, central_CHN])
btw = metrorail1.Station("Bonteheuwel", "BTW", [central_BLV, central_KPT, central_CHN])
lvs = metrorail1.Station("Lavistown", "LVS", [central_BLV])
blh = metrorail1.Station("Belhar", "BLH", [central_BLV])
uni = metrorail1.Station("Unibell", "UNI", [central_BLV])
pen = metrorail1.Station("Pentech", "PEN", [central_BLV])
srp = metrorail1.Station("Sarepta", "SRP", [central_BLV])

blv = metrorail1.Station("Bellville", "BLV", [northern_MTV, northern_MUT, central_BLV])

net = metrorail1.Station("Netreg", "NET", [central_KPT, central_CHN])
hdv = metrorail1.Station("Heideveld", "HDV", [central_KPT, central_CHN])
nya = metrorail1.Station("Nyanga", "NYA", [central_KPT, central_CHN])
ppi = metrorail1.Station("Philippi", "PPI", [central_KPT, central_CHN])


ndb = metrorail1.Station("Ndabeni", "NDB", [central_KPT, cape_flats])
pnl = metrorail1.Station("Pinelands", "PNL", [central_KPT, cape_flats])

ltg = metrorail1.Station("Lentegeur", "LTG", [central_KPT])
mpl = metrorail1.Station("Mitchell's Plain", "MPL", [central_KPT])
kpt = metrorail1.Station("Kapteinsklip", "KPT", [central_KPT])

sto = metrorail1.Station("Stock Road", "STO", [central_CHN])
man = metrorail1.Station("Mandalay", "MAN", [central_CHN])
nol = metrorail1.Station("Nolungile", "NOL", [central_CHN])
nkq = metrorail1.Station("Nonkqubela", "NKQ", [central_CHN])
khy = metrorail1.Station("Khayelitsha", "KHY", [central_CHN])
kuy = metrorail1.Station("Kuyasa", "KUY", [central_CHN])
chn = metrorail1.Station("Chris Hani", "CHN", [central_CHN])



wsk = metrorail1.Station("Woodstock", "WSK", [central_KPT, northern_MUT, southern, cape_flats])
slt = metrorail1.Station("Salt River", "SLT", [central_KPT, northern_MUT, southern, cape_flats])
koe = metrorail1.Station("Koeberg Road", "KOE", [central_KPT, northern_MUT, cape_flats])
mai = metrorail1.Station("Maitland", "MAI", [central_KPT, northern_MUT, cape_flats])


wol = metrorail1.Station("Woltemade", "WOL", [northern_MUT])
ttn = metrorail1.Station("Thornton", "TTN", [northern_MUT])
gdw = metrorail1.Station("Goodwood", "GDW", [northern_MUT])
vas = metrorail1.Station("Vasco", "VAS", [northern_MUT])
els = metrorail1.Station("Elsies Rivier", "ELS", [northern_MUT])
prw = metrorail1.Station("Parow", "PRW", [northern_MUT])
tyg = metrorail1.Station("Tygerberg", "TYG", [northern_MUT])

ken = metrorail1.Station("Kentemade", "KEN", [northern_MTV])
ctc = metrorail1.Station("Century City", "CTC", [northern_MTV])
aka = metrorail1.Station("Akasia Park", "AKA", [northern_MTV])
mtv = metrorail1.Station("Monte Vista", "MTV", [northern_MTV])
dgd = metrorail1.Station("De Grendel", "DGD", [northern_MTV])
avo = metrorail1.Station("Avondale", "AVO", [northern_MTV])
ooz = metrorail1.Station("Oosterzee", "OOZ", [northern_MTV])

haz = metrorail1.Station("Hazendal", "HAZ", [cape_flats])
ath = metrorail1.Station("Athlone", "ATH", [cape_flats])
crw = metrorail1.Station("Crawford", "CRW", [cape_flats])
lnd = metrorail1.Station("Lansdowne", "LND", [cape_flats])
wet = metrorail1.Station("Wetton", "WET", [cape_flats])
ott = metrorail1.Station("Ottery", "OTT", [cape_flats])
stf = metrorail1.Station("Southfield", "STF", [cape_flats])

htf = metrorail1.Station("Heathfield", "HTF", [southern, cape_flats])
ret = metrorail1.Station("Retreat", "RET", [southern, cape_flats])


obs = metrorail1.Station("Observatory", "OBS", [southern])
mow = metrorail1.Station("Mowbray", "MOW", [southern])
rsb = metrorail1.Station("Rosebank", "RSB", [southern])
rdb = metrorail1.Station("Rondebosch", "RDB", [southern])
new = metrorail1.Station("Newlands", "NEW", [southern])
clr = metrorail1.Station("Claremont", "CLR", [southern])
har = metrorail1.Station("Harfield Road", "HAR", [southern])
knw = metrorail1.Station("Kenilworth", "KNW", [southern])
wyn = metrorail1.Station("Wynberg", "WYN", [southern])
wit = metrorail1.Station("Wittebome", "WIT", [southern])
plm = metrorail1.Station("Plumstead", "PLM", [southern])
sth = metrorail1.Station("Steurhof", "STH", [southern])
dpr = metrorail1.Station("Diep River", "DPR", [southern])

stb = metrorail1.Station("Steenberg", "STB", [southern])
lks = metrorail1.Station("Lakeside", "LKS", [southern])
fsb = metrorail1.Station("False Bay", "FSB", [southern])
mzb = metrorail1.Station("Muizenberg", "MZB", [southern])
stj = metrorail2.Station("St. James", "STJ", [southern])
kkb = metrorail1.Station("Kalk Bay", "KKB", [southern])
fsh = metrorail1.Station("Fish Hoek", "FSH", [southern])
snc = metrorail1.Station("Sunny Cove", "SNC", [southern])
glc = metrorail1.Station("Glencairn", "GLC", [southern])
sim = metrorail1.Station("Simonstown", "SIM", [southern])


# populating lines with their stations (IN PROPER ORDER, outbound from Cape Town to the other end of the line)

central_BLV.set_stations([cpt, esp, yst, mut, lng, btw, lvs, blh, uni, pen, srp, blv])
northern_MUT.set_stations([cpt, wsk, slt, koe, mai, wol, mut, ttn, gdw, vas, els, prw, tyg, blv]) 
central_KPT.set_stations([cpt, wsk, slt, koe, mai, ndb, pnl, lng, btw, net, hdv, nya, ppi, ltg, mpl, kpt])
central_CHN.set_stations([cpt, esp, yst, mut, lng, btw, net, hdv, nya, ppi, sto, man, nol, nkq, khy, kuy, chn])
northern_MTV.set_stations([cpt, esp, yst, ken, ctc, aka, mtv, dgd, avo, ooz, blv])
cape_flats.set_stations([cpt, wsk, slt, koe, mai, ndb, pnl, haz, ath, crw, lnd, wet, ott, stf, htf, ret])
southern.set_stations([cpt, wsk, slt, obs, mow, rsb, rdb, new, clr, har, knw, wyn, wit, plm, sth, dpr, htf, ret, stb, lks, fsb, mzb, stj, kkb, fsh, snc, glc, sim])



