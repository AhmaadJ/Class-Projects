TripData <- read.csv("C:/Users/Ahmaad Jackson/Desktop/Datasets/50KJan20NYCCitybike.csv")
View(TripData)

#Separate the customer & subscriber data
customer.data <- subset(TripData, TripData$usertype=="Customer")
subscriber.data <- subset(TripData, TripData$usertype=="Subscriber")
male.data <- subset(TripData, TripData$gender=="1")
female.data <- subset(TripData, TripData$gender=="2")

#Calculate the mean, std.dev, & number of observations
mean.customer <- mean(customer.data$tripduration)
mean.subscriber <- mean(subscriber.data$tripduration)
mean.male <- mean(male.data$tripduration)
mean.female <- mean(female.data$tripduration)
sd.customer <- sd(customer.data$tripduration)
sd.subscriber <- sd(subscriber.data$tripduration)
sd.male <- sd(male.data$tripduration)
sd.female <- sd(female.data$tripduration)
num.customer <- length(customer.data$tripduration)
num.subscriber <- length(subscriber.data$tripduration)
num.male <- length(male.data$tripduration)
num.female <- length(female.data$tripduration)

#Before the z-score is calculated, create 
#the information in the denominator
sd.customer.subs <- sqrt(sd.customer^2/num.customer + sd.subscriber^2/num.subscriber)
sd.male.female <- sqrt(sd.male^2/num.male + sd.female^2/num.female)

#Calculate the z-score
z.score.cs <- (mean.subscriber-mean.customer)/sd.customer.subs
z.score.mf <- (mean.male-mean.female)/sd.male.female

#Plot the data
par(mar=c(4,4,2,4))
plot(x=seq(from = -15, to= 15, by=0.5),y=dnorm(seq(from = -15, to= 15,  by=0.5),mean=0),type='l',xlab = 'mean difference',  ylab='possibility')
abline(v=z.score.cs, col='red')
p.cs <- 1-pnorm(z.score.cs)
plot(x=seq(from = -5, to= 5, by=0.1),y=dnorm(seq(from = -5, to= 5,  by=0.1),mean=0),type='l',xlab = 'mean difference',  ylab='possibility')
abline(v=z.score.mf, col='blue')
p.mf <- 1-pnorm(z.score.mf)