
    def set_stations(self,stations):

        if stations == [cpt,esp,yst,ken,cen,aka,mon,deg,avo,oos,blv]:
            self.stations = stations
            return self.stations


        elif stations == [cpt,wsk,slt,koe,mai,wol,ttn,gdw,vas,els,prw,tyg,blv]:
            self.stations = stations
            return self.stations

        elif stations == [cpt,wsk,slt,koe,mai,nda,pin,lng,btw,lvs,blh,uni,pen,srp,blv]:
            self.stations = stations
            return self.stations

        elif stations == [cpt,esp,yst,mut,lng,btw,net,hei,nya,ppi,sto,man,nol,non,kha,kuy,cri]:
            self.stations = stations
            return self.stations

        elif stations == [cpt,wsk,slt,koe,mai,nda,pin,lng,btw,net,hei,nya,ppi,let,mit,kap]:
            self.stations = stations
            return self.stations

        elif stations== [cpt,wsk,slt,koe,mai,nda,pin,haz,ath,ath,cra,lan,wet,ott,sou,hea,ret]:
            self.stations = stations
            return self.stations

        elif stations ==[cpt,wsk,slt,obs,mow,ros,ron,new,cla,har,ken,wyn,wit,plu,ste,die,ste,lak,fal,mui,stj,kal,fis,sun,gle,sim]:
            self.stations = stations
        return self.stations
            
        else:
            return print("The Train list you have filled in is not in the correct order \n ")
        
         
        
#################################################################################################################
    def get_stations (self):
       stations = set_stations.stations
       return stations
       
       
           
    
#################################################################################################################        

    def has_stations(self,stn):
      stations = get_stations.stations
      if stn in stations == True:
          return True
      else:
          return False
       
    
#################################################################################################################
    
    def index_stations(self,stn):
       
        index = get_stations.stations[stn]
        if stn in self.stations:
            return index
        else:
            return -1
##################################################################################################################
        
       
    def number_stops_and_direction(self,stn_from,stn_to):
        accu = 0
        
        for i in range(self.station([stn_from]),self.station([stn_to])):
                       accu +=1
        return accu

################################################################################################################
    
class Station:

    def __init__(self,name,code,lines,is_interchange):
        self.name = name
        self.code = code
        self.lines = lines
        self.is_interchange = is_interchange
        
    
        
    def is_on_line(self,lines):
        for i in lines:
          if i == northern_MTV:
              northern_MTV +=1

          elif i == northern_MUT:
              northern_MUT +=1

          elif i == central_BLV:
              central_BLV +=1

          elif i == central_CHN:
              central_CHN +=1
          elif i == central_KPT:
              central_KPT +=1
          elif i == cape_flats:
              cape_flats +=1
          elif i == southern :
              southern +=1
          else:


             if Line.has_station == True: 
              return print("Warning! inconsistent situations")
             else:
                 return print("Error re-enter Stations")

        return print("The follwing lines are a member of the lines this amount of times northern_MTV = "+northern_MTV+" northern_MUT = "+northern_MUT+" central_BLV = "+central+" central_CHN = "+central_CHN+" central_KPT = "+central_KPT+" cape_flats = "+cape_flats+" southern = "+southern)

    def route_to(self,destination):
      return None
############################################################################################



    
############################################################################################


network_lines = [northern_MTV,northern_MUT,central_BLV,central_KPT,cape_flats,southern]

############################################################################################


