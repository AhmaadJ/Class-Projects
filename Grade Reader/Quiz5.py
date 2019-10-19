#Write a program that reads 30 grades from a file(grades.txt)
#Uses three functions to calculate the average, standard deviation,
#& grade range frequency for the 30 grades

#variance = sum of all differences between 
#the points in the data
#and the mean
#square it, and divide by
#All of the numbers in the data minus 1

NUM_GRADES = 30
def main():
   gradeList = [57, 94, 81, 77, 66, 97, 62, 86, 75, 87,
        91, 78, 61, 82, 74, 72, 70, 88, 66, 75,
        55, 66, 58, 73, 79, 51, 63, 77, 52, 84] 
   average(gradeList)
   frequency(gradeList)
   
def average(x):
   for grade in x:
      gradeSum = sum(x)
      mean = gradeSum/NUM_GRADES
   print('Average Grade: ', format(mean, '.2f'))
   deviation(x, mean)
   
def deviation(x, mean):
   vSum = 0
   for grade in x:
      v = (grade-mean)**2    
      vSum = vSum + v
      variance = vSum/(NUM_GRADES-1)
   sDev = variance**0.5
   print('Standard Deviation: ', format(sDev, '.2f'))

def frequency(x):
      t50 = 0
      t60 = 0
      t70 = 0
      t80 = 0
      t90 = 0
      for grade in x:
         if grade > 49 and grade < 60:
            t50 = t50 + 1      
         if grade > 59 and grade < 70:
            t60 = t60 + 1      
         if grade > 69 and grade < 80:
            t70 = t70 + 1      
         if grade > 79 and grade < 90:
            t80 = t80 + 1      
         if grade > 89 and grade < 100:
            t90 = t90 + 1 
      print('Grade Range Frequency: ')
      print('50-59: ', t50)      
      print('60-69: ', t60)         
      print('70-79: ', t70)    
      print('80-89: ', t80)    
      print('90-99: ', t90)  
main()  