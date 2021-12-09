# You can leave all these object instantiations in a single file
# that you will import in your main file through a simple "import"
# instruction following the definition of your classes.

import RailWay
from RailWay import Line
from RailWay import Station

# six other lines have to be defined here
northern_MTV = Line("Bellville via Monte Vista","green","91",[cpt,esp,yst,ken,cen,aka,mon,deg,avo,oos,blv])
northern_MUT = Line("BEllville via Mutual","green","92",[cpt,wsk,slt,koe,mai,wol,ttn,gdw,vas,els,prw,tyg,blv])
central_BLV = Line("Bellville via Lavistown", "blue", "93",[cpt,wsk,slt,koe,mai,nda,pin,lng,btw,lvs,blh,uni,pen,srp,blv])
central_CHN = Line("Chris Hani via Esplanade","blue","94",[cpt,esp,yst,mut,lng,btw,net,hei,nya,ppi,sto,man,nol,non,kha,kuy,cri])
central_KPT = Line("Kapteinsklip via Pinelands","blue","95",[cpt,wsk,slt,koe,mai,nda,pin,lng,btw,net,hei,nya,ppi,let,mit,kap])
cape_flats = Line("Retreat via Pinelands","brown","96",[cpt,wsk,slt,koe,mai,nda,pin,haz,ath,ath,cra,lan,wet,ott,sou,hea,ret])
southern = Line("Simonstown via Retreat","Red","97",[cpt,wsk,slt,obs,mow,ros,ron,new,cla,har,ken,wyn,wit,plu,ste,die,ste,lak,fal,mui,stj,kal,fis,sun,gle,sim])


# instantiating train stations
cpt = Station("Cape Town", "CPT", [northern_MTV, northern_MUT, central_BLV, central_KPT, central_CHN, southern, cape_flats],True)

esp = Station("Esplanade", "ESP", [northern_MTV, central_BLV, central_CHN],True)
yst = Station("Ysterplaat", "YST", [northern_MTV, central_BLV, central_CHN],True)


ken = Station("Kentemade", "KEN",[northern_MTV],False)    #91
cen = Station("Century City","CEN",[northern_MTV],False)
aka = Station("Akasiapark","AKA",[northern_MTV],False)
mon = Station("Monte Vista","MON",[northern_MTV],False)
deg = Station("De Grendel","DEG",[northern_MTV],False)
avo = Station("Avondale","AVO",[northern_MTV],False)
oos = Station("Oosterzee","OOS",[northern_MTV],False)

mut = Station("Mutual", "MUT", [central_BLV, central_CHN, northern_MUT],False)#93 94
lng = Station("Langa", "LNG", [central_BLV, central_KPT, central_CHN],False)#93 94
btw = Station("Bonteheuwel", "BTW", [central_BLV, central_KPT, central_CHN],False)#93 94


lvs = Station("Lavistown", "LVS", [central_BLV],False)#93
blh = Station("Belhar", "BLH", [central_BLV],False)
uni = Station("Unibell", "UNI", [central_BLV],False)
pen = Station("Pentech", "PEN", [central_BLV],False)
srp = Station("Sarepta", "SRP", [central_BLV],False)

blv = Station("Bellville", "BLV", [northern_MTV, northern_MUT, central_BLV],True)

sto = Station("Stock Road", "STO", [central_CHN],False) #94
man = Station("Mandalay","MAN",[central_CHN],False)
nol = Station("Nolungile","NOL",[central_CHN],False)
non = Station("Nonkqubela","NON",[central_CHN],False)
kha = Station("Khayelitsha","KHA",[central_CHN],False)
kuy = Station("Kuyasa","KUY",[central_CHN],False)
cri = Station("Chris Hani","CRI",[central_CHN],False)

net = Station("Netreg","NET",[central_KPT,central_CHN],False) #94 95
nya = Station("Nyanga", "NYA", [central_KPT, central_CHN],False)
hei = Station("Heideveld","HEI",[central_KPT,central_CHN],False)
ppi = Station("Philippi", "PPI", [central_KPT, central_CHN],False)

let = Station("Lenteguer","LET",[central_KPT],False)#95
mit = Station("Mitchell's Plain","MIT",[central_KPT],False)
kap = Station("Kapteinsklip","KAP",[central_KPT],False)


hea = Station("Heathfield","HEA",[southern,cape_flats],True)
ret = Station("Retreat", "RET", [southern, cape_flats],True)
koe = Station("Koeberg Road", "KOE", [central_KPT, northern_MUT, cape_flats],True)
mai = Station("Maitland", "MAI", [central_KPT, northern_MUT, cape_flats],True)

nda = Station("Ndabeni","NDA", [central_KPT,cape_flats],True) #96
pin = Station("Pinelands","PIN",[central_KPT,cape_flats],True)
haz = Station("Hazendal","HAZ",[central_KPT,cape_flats],False)
ath = Station("Athlone","ATH",[central_KPT,cape_flats],False)
cra = Station("Crawford","CRA",[central_KPT,cape_flats],False)
lan = Station("Lansdowne","LAN",[central_KPT,cape_flats],False)
wet = Station("Wetton","WET",[central_KPT,cape_flats],False)

ott = Station("Ottery","OTT",[cape_flats],False)
sou = Station("Southfield","SOU",[cape_flats],False)


wsk = Station("Woodstock", "WSK", [central_KPT, northern_MUT, southern, cape_flats],True)
slt = Station("Salt River", "SLT", [central_KPT, northern_MUT, southern, cape_flats],True)

obs = Station("Observatory","OBS",[southern],False) #97
mow = Station("Mowbray","MOW",[southern],False)
ros = Station("Rosebank","ROS",[southern],False)
ron = Station("Rondebosch","RON",[southern],False)
new = Station("Newlands","NEW",[southern],False)
cla = Station("Claremont","CLA",[southern],False)
har = Station("Harfield","HAR",[southern],False)
ken = Station("Kenilworth","KEN",[southern],False)
wyn = Station("Wynberg","WYN",[southern],False)
wit = Station("Wittebome","WIT",[southern],False)
plu = Station("Plumstead","PLU",[southern],False)
ste = Station("Steurhof","STE",[southern],False)
die = Station("Diep River","DIE",[southern],False)
ste = Station("Steenberg","STE",[southern],False)
lak = Station("Lakeside","LAK",[southern],False)
fal = Station("False Bay","FAL",[southern],False)
mui = Station("Muizenberg","MUI",[southern],False)
stj = Station("St. James","STJ",[southern],False)
kal = Station("Kalk Bay","KAL",[southern],False)
fis = Station("Fish Hoek","FIS",[southern],False)
sun = Station("Sunny Cove","SUN",[southern],False)
gle = Station("Glencairn","GLE",[southern],False)
sim = Station("Simonstown","SIM",[southern],False)


wol = Station("Woltemade", "WOL", [northern_MUT],False) #92
ttn = Station("Thornton", "TTN", [northern_MUT],False)
gdw = Station("Goodwood", "GDW", [northern_MUT],False)
vas = Station("Vasco", "VAS", [northern_MUT],False)
els = Station("Elsies Rivier", "ELS", [northern_MUT],False)
prw = Station("Parow", "PRW", [northern_MUT],False)
tyg = Station("Tygerberg", "TYG", [northern_MUT],False)

