b=0

#try:
#    print(a)
#except NameError as e:
 #   print(type(e))
  #  print(e)
   # print(e.args)
    #print("Now done with the expception handler")

#print(e)
   # raise e
#err = ZeroDivisionError("Division Error here")
#raise err

try:
    err = NameError ("a is not defined")
    raise err
except NameError:
                     print(" I caught the error ")
