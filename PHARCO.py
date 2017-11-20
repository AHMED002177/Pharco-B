# -*- coding: utf-8 -*-
a= 0.03
print ("                برجاء كتابه الراتب الاساسي")
b= input ("Salary:")
DW= a*b
H= b/210.0
print ("             برجاء كتابه عدد ايام الوردادي")
print ("                       حد أقصي عشرة ايام")
c= input ("number Watch Day:")
totalwd= DW*c
valHD= 1.3
valHN= 1.7
valholidays= 2
r= 1.5
t= 2
e= 4
print ("           برجاء ادخال عدد الايام النهارية")
day= input ("Day:")
print ("            برجاء ادخال عدد الايام الليليه")
night= input ("Night:")
tday1= day*r
tdayni= day*t
tnight= night*e
allnight= tdayni+tnight
print ("                      عدد الساعات النهارية")
print tday1 #ساعات النهارية
print ("                       عدد الساعات الليلية")
print allnight #ساعات الليلية
HD= valHD*tday1  #قيمه الساعات النهارية
ND= valHN*allnight  #قيمه الساعات الليلية
print ("              برجاء ادخال عدد ايام العطلات")
NHOLI= input ("Number Holidays:")
HOL= valholidays*NHOLI  #قيمه ساعات العطلات
HOUR= HD+ND+HOL
ALLHOUR= HOUR*H
TOTAL= totalwd+ALLHOUR
print ("                         قيمه يوم الورديه")
print DW     #ناتج قيمه يوم الورديه       
print ("                            قيمه الساعه")
print H      #ناتج قيمه الساعه
print ("                              الاجمالي")
print TOTAL