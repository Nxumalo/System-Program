import random
#3538264 Fraser Nxumalo
#Metro Rail Cape Town


import random

class Line:

    
    def __init__(self,long_name,colour,train_num_prefix): #My train prefix ranges from 91-97
        self.long_name = long_name
        self.colour = colour
        self.train_num_prefix = train_num_prefix
        
       
###################################################################################################################

    def set_stations(self,stations):
        self.stations = stations
        self.endpoints = [stations[0],stations[len(stations)-1]]
        self.nb_stations = len(stations)
      
###################################################################################################################
 
    def get_stations(self):
         lo_stn = []
         for i in self.stations:
                    lo_stn.append(str(i))
         return lo_stn
                     
###################################################################################################################

    def has_station(self,stn):
        if stn in self.stations:
            return True
        else:
            return False

###################################################################################################################

    def index_station(self,stn):
       index = 0
       for i in self.stations:
            if i == stn:
                return index
            index +=1
            if index > len(self.stations):
                return -1
                
       

       
###################################################################################################################

    def number_stops_and_direction(self,stn_from,stn_to):
        if stn_from == stn_to:
                return [0, None]
        if stn_from in self.stations and stn_to in self.stations:
                ind_from = self.stations.index(stn_from)
                ind_to = self.stations.index(stn_to)
                if ind_from < ind_to:
                        nmbr_stops = ind_to-ind_from
                        direction = self.stations[1]
                else:
                        nmbr_stops = ind_from-ind_to
                        direction = self.endpoints[0]
                return [nmbr_stops, direction]
        return [-1, None]
#################################################################################################################

    def __str__(self):
	    return "{0}, {1}, {2}".format(self.long_name, self.colour, self.train_num_prefix)

#################################################################################################################    


    def set_random_times(self):
        travel_times = random.randint(40,120)
        return travel_times
################################################################################################################
        
        
        
#################################################################################################################

class Station(Line):

    def __init__(self,name,code,lines,is_interchange):
        self.name = name
        self.code = code
        self.lines = lines
        self.is_interchange = is_interchange

###################################################################################################################
    def is_on_line(self,line):
        if line in self.lines:
            if line.has_station(self) == True:
                return True
                print("Warning! Inconsistent situation: station {0} claims it is on line {1}, but the line fails to list it as one of its stations!")

            else:
                return False

        

############################################################################################################################################################################################
            
    def route_to(self, destination):
            for i in self.lines:
                if  i.has_station(destination) == True:
                    temp = i.number_stops_and_direction(self, destination)
                    return "Route from {0} to {1}:\nFrom {0} to {1} on line '{2}', direction {3} ({4} stops)".format(self.name, destination.name, i.long_name, temp[1], temp[0])
            stops = 100
            ls = []
            for j in self.lines:
                for k in j.stations:
                            if k.is_interchange == True:
                                var = j.number_stops_and_direction(self, k)
                                for l in k.lines:
                                        if l.has_station(destination) == True:
                                                var1 = l.number_stops_and_direction(k, destination)
                                                if (var[0] + var1[0]) <= stops:
                                                        stops = (var[0] + var1[0])
                                                        ls.append([k, j, var, l, var1])
            a = ls.pop()
            return ("Route from {0} to {1}:\nFrom {0} to {2} on line '{3}', direction {4} ({5} stops)".format(self.name, destination.name, a[0], a[1], a[2][1], a[2][0]) + "\n" + "Change trains in {0}\nFrom {0} to {1} on line '{2}', direction {3} ({4} stops)".format(a[0].name, destination.name, a[3].long_name, a[4][1], a[4][0]))

#######################################################################################################################################################################################################################################################################################################################################################
	
    def __str__(self):
	    return "{0}".format(self.name)









        
###################################################################################################################
northern_MTV = Line("Bellville via Monte Vista","green","91")
northern_MUT = Line("BEllville via Mutual","green","92")
central_BLV = Line("Bellville via Lavistown", "blue", "93")
central_CHN = Line("Chris Hani via Esplanade","blue","94")
central_KPT = Line("Kapteinsklip via Pinelands","blue","95")
cape_flats = Line("Retreat via Pinelands","brown","96")
southern = Line("Simonstown via Retreat","Red","97")


# instantiating train stations
cpt = Station("Cape Town", "CPT", [northern_MTV, northern_MUT, central_BLV, central_KPT, central_CHN, southern, cape_flats],True)

esp = Station("Esplanade", "ESP", [northern_MTV, central_BLV, central_CHN],True)
yst = Station("Ysterplaat", "YST", [northern_MTV, central_BLV, central_CHN],True)


ket = Station("Kentemade", "KEN",[northern_MTV],False)    #91
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


##################################################################################################################
    
network_lines = [northern_MTV, northern_MUT, central_BLV, central_KPT, central_CHN, southern, cape_flats]

##################################################################################################################
northern_MTV.set_stations([cpt,esp,yst,ket,cen,aka,mon,deg,avo,oos,blv])
northern_MUT.set_stations([cpt,wsk,slt,koe,mai,wol,ttn,gdw,vas,els,prw,tyg,blv])
central_BLV.set_stations([cpt,wsk,slt,koe,mai,nda,pin,lng,btw,lvs,blh,uni,pen,srp,blv])
central_CHN.set_stations([cpt,esp,yst,mut,lng,btw,net,hei,nya,ppi,sto,man,nol,non,kha,kuy,cri])
central_KPT.set_stations([cpt,wsk,slt,koe,mai,nda,pin,lng,btw,net,hei,nya,ppi,let,mit,kap])
cape_flats.set_stations([cpt,wsk,slt,koe,mai,nda,pin,haz,ath,ath,cra,lan,wet,ott,sou,hea,ret])
southern.set_stations([cpt,wsk,slt,obs,mow,ros,ron,new,cla,har,ken,wyn,wit,plu,ste,die,hea,ret,ste,lak,fal,mui,stj,kal,fis,sun,gle,sim])



##################################################################################################################
print("Tests")
print("\n central_KPT: ", central_KPT)
print("\n cen: ",cen )
print("\n lng.is_on_line(central_KPT): ", lng.is_on_line(central_KPT))
print("\n central_KPT.index_station(ppi): ", central_KPT.index_station(ppi))
print("\n central_KPT.get_stations(): ", central_KPT.get_stations())
print("\n central_KPT.stations[4]: ", central_KPT.stations[4])
print("\n central_KPT.number_stops_and_direction(mai, lan): ", central_KPT.number_stops_and_direction(mai, lng))
print("\n cpt.route_to(obs): " + cpt.route_to(obs))
print("\n random times : " , int( Line.set_random_times(Line)))


########################################################################################################################



class Stations_2(Line):

    def __init__(self,name,code):

        self.name = name
        self.code = code
        Line.set_stations()
        













