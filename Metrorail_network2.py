import metrorail2
import random

# instantiating train lines
central_BLV = metrorail2.Line("Bellville via Lavistown", "blue", "90")
central_KPT = metrorail2.Line("Kapteinsklip via Pinelands", "blue", "95")
central_CHN = metrorail2.Line("Chris Hani via Esplanade", "blue", "99")
northern_MTV = metrorail2.Line("Bellville via Monte Vista", "green", "2")
northern_MUT = metrorail2.Line("Bellville via Mutual", "green", "3")
cape_flats = metrorail2.Line("Retreat via Athlone", "brown", "05")
southern = metrorail2.Line("Simonstown", "red", "02")

# global variable containing all the lines in a list:
network_lines = [central_BLV, central_KPT, central_CHN, northern_MUT, northern_MTV, cape_flats, southern]

# instantiating (creating) train stations
cpt = metrorail2.Station("Cape Town", "CPT")

esp = metrorail2.Station("Esplanade", "ESP")
yst = metrorail2.Station("Ysterplaat", "YST")
mut = metrorail2.Station("Mutual", "MUT")
lng = metrorail2.Station("Langa", "LNG")
btw = metrorail2.Station("Bonteheuwel", "BTW")
lvs = metrorail2.Station("Lavistown", "LVS")
blh = metrorail2.Station("Belhar", "BLH")
uni = metrorail2.Station("Unibell", "UNI")
pen = metrorail2.Station("Pentech", "PEN")
srp = metrorail2.Station("Sarepta", "SRP")

blv = metrorail2.Station("Bellville", "BLV")

net = metrorail2.Station("Netreg", "NET")
hdv = metrorail2.Station("Heideveld", "HDV")
nya = metrorail2.Station("Nyanga", "NYA")
ppi = metrorail2.Station("Philippi", "PPI")


ndb = metrorail2.Station("Ndabeni", "NDB")
pnl = metrorail2.Station("Pinelands", "PNL")

ltg = metrorail2.Station("Lentegeur", "LTG")
mpl = metrorail2.Station("Mitchell's Plain", "MPL")
kpt = metrorail2.Station("Kapteinsklip", "KPT")

sto = metrorail2.Station("Stock Road", "STO")
man = metrorail2.Station("Mandalay", "MAN")
nol = metrorail2.Station("Nolungile", "NOL")
nkq = metrorail2.Station("Nonkqubela", "NKQ")
khy = metrorail2.Station("Khayelitsha", "KHY")
kuy = metrorail2.Station("Kuyasa", "KUY")
chn = metrorail2.Station("Chris Hani", "CHN")




wsk = metrorail2.Station("Woodstock", "WSK")
slt = metrorail2.Station("Salt River", "SLT")
koe = metrorail2.Station("Koeberg Road", "KOE")
mai = metrorail2.Station("Maitland", "MAI")



wol = metrorail2.Station("Woltemade", "WOL")
ttn = metrorail2.Station("Thornton", "TTN")
gdw = metrorail2.Station("Goodwood", "GDW")
vas = metrorail2.Station("Vasco", "VAS")
els = metrorail2.Station("Elsies Rivier", "ELS")
prw = metrorail2.Station("Parow", "PRW")
tyg = metrorail2.Station("Tygerberg", "TYG")

ken = metrorail2.Station("Kentemade", "KEN")
ctc = metrorail2.Station("Century City", "CTC")
aka = metrorail2.Station("Akasia Park", "AKA")
mtv = metrorail2.Station("Monte Vista", "MTV")
dgd = metrorail2.Station("De Grendel", "DGD")
avo = metrorail2.Station("Avondale", "AVO")
ooz = metrorail2.Station("Oosterzee", "OOZ")

haz = metrorail2.Station("Hazendal", "HAZ")
ath = metrorail2.Station("Athlone", "ATH")
crw = metrorail2.Station("Crawford", "CRW")
lnd = metrorail2.Station("Lansdowne", "LND")
wet = metrorail2.Station("Wetton", "WET")
ott = metrorail2.Station("Ottery", "OTT")
stf = metrorail2.Station("Southfield", "STF")

htf = metrorail2.Station("Heathfield", "HTF")
ret = metrorail2.Station("Retreat", "RET")


obs = metrorail2.Station("Observatory", "OBS")
mow = metrorail2.Station("Mowbray", "MOW")
rsb = metrorail2.Station("Rosebank", "RSB")
rdb = metrorail2.Station("Rondebosch", "RDB")
new = metrorail2.Station("Newlands", "NEW")
clr = metrorail2.Station("Claremont", "CLR")
har = metrorail2.Station("Harfield Road", "HAR")
knw = metrorail2.Station("Kenilworth", "KNW")
wyn = metrorail2.Station("Wynberg", "WYN")
wit = metrorail2.Station("Wittebome", "WIT")
plm = metrorail2.Station("Plumstead", "PLM")
sth = metrorail2.Station("Steurhof", "STH")
dpr = metrorail2.Station("Diep River", "DPR")

stb = metrorail2.Station("Steenberg", "STB")
lks = metrorail2.Station("Lakeside", "LKS")
fsb = metrorail2.Station("False Bay", "FSB")
mzb = metrorail2.Station("Muizenberg", "MZB")
stj = metrorail2.Station("St. James", "STJ")
kkb = metrorail2.Station("Kalk Bay", "KKB")
fsh = metrorail2.Station("Fish Hoek", "FSH")
snc = metrorail2.Station("Sunny Cove", "SNC")
glc = metrorail2.Station("Glencairn", "GLC")
sim = metrorail2.Station("Simonstown", "SIM")


# populating lines with their stations (IN PROPER ORDER, outbound from Cape Town to the other end of the line)

central_BLV.set_stations([cpt, esp, yst, mut, lng, btw, lvs, blh, uni, pen, srp, blv])
northern_MUT.set_stations([cpt, wsk, slt, koe, mai, wol, mut, ttn, gdw, vas, els, prw, tyg, blv]) 
central_KPT.set_stations([cpt, wsk, slt, koe, mai, ndb, pnl, lng, btw, net, hdv, nya, ppi, ltg, mpl, kpt])
central_CHN.set_stations([cpt, esp, yst, mut, lng, btw, net, hdv, nya, ppi, sto, man, nol, nkq, khy, kuy, chn])
northern_MTV.set_stations([cpt, esp, yst, ken, ctc, aka, mtv, dgd, avo, ooz, blv])
cape_flats.set_stations([cpt, wsk, slt, koe, mai, ndb, pnl, haz, ath, crw, lnd, wet, ott, stf, htf, ret])
southern.set_stations([cpt, wsk, slt, obs, mow, rsb, rdb, new, clr, har, knw, wyn, wit, plm, sth, dpr, htf, ret, stb, lks, fsb, mzb, stj, kkb, fsh, snc, glc, sim])


# creating the travel times between stations (in this version 2 of the prac)
random_generator = random.Random()
for myline in network_lines:
		myline.set_random_travel_times(random_generator)


# and then generating random interconnection times for Mutual:
nb_lines = mut.get_num_lines()
mut.interconnect_time = []
for i in range(nb_lines):
		mut.interconnect_time.append([]) # start with an empty list for this row of the matrix
		for j in range(nb_lines):
				if i == j:
						mut.interconnect_time[i].append(0) # doesn't make sense to change from line x to line x
				else:
						mut.interconnect_time[i].append(random_generator.randint(20,80)) # between 20 and 80 seconds to realize a line interchange

