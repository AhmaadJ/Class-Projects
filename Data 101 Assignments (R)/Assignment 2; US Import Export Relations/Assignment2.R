en_visualize_explore_tree_map_hs92_export_usa_show_all_2017 <- read.csv("C:/Users/Ahmaad Jackson/Desktop/Datasets/en_visualize_explore_tree_map_hs92_export_usa_show_all_2017.csv", header=FALSE)
View(en_visualize_explore_tree_map_hs92_export_usa_show_all_2017)

#Create the boxplot
View(export_2017)
value <- as.numeric(sub("%","",export_2017$export_val_pct))
value <- as.integer(sub("%","",export_2017$export_val_pct))
export_2017$value <- as.integer(sub("%","",export_2017$export_val_pct))
par(mar=c(4,4,2,4))
boxplot(export_2017$value~export_2017$country_destination_id,main='Exports in the USA from 2017', xlab='Country',ylab='Export Value(%)', col.main='dark red', las=2, cex.lab=0.9, col.lab='dark blue')

#Create a mosaic plot
US.Canada.Exports.1997.2017 <- read.csv("C:/Users/Ahmaad Jackson/Desktop/Datasets/US-Canada Exports 1997-2017.csv")
CanadaHist <- US.Canada.Exports.1997.2017
View(CanadaHist)
par(mar=c(4,4,2,4))
mosaicplot(CanadaHist$year~CanadaHist$export_val, main = 'US-Canada Export Value 1997-2017', xlab='Year', ylab='Export Value Amount (In Dollars)', las=1, color=c('gold','red'))

#Create a Pie Chart
`07.17.Import.Trends` <- read.csv("C:/Users/Ahmaad Jackson/Desktop/Datasets/07-17 Import Trends.csv")
Import_Data <- `07.17.Import.Trends`
View(Import_Data)
numbers <- as.numeric(sub("%","",Import_Data$import_val_pct))
par(mar=c(4,4,2,4))
pie(numbers, Import_Data$country_destination_id, main = "Top Ten U.S. Importers 2017", col= c('darkred','green','red', 'lightpink', 'yellow', 'blue', 'palegreen', 'royalblue', 'olivedrab1', 'orange'))
assortment <- c('darkred','green','red', 'lightpink', 'yellow', 'blue', 'palegreen', 'royalblue', 'olivedrab1', 'orange')
lbls <- paste(Import_Data$country_destination_id, numbers)
lbls <- paste(lbls, "%", sep="") #add % to labels
pie(numbers, Import_Data$country_destination_id, main = "Top Ten U.S. Importers 2017", col= c('darkred','green','red', 'lightpink', 'yellow', 'blue', 'palegreen', 'royalblue', 'olivedrab1', 'orange'))
pie(numbers, Import_Data$country_destination_id, main = "Top Ten U.S. Importers 2017", col= assortment)
pie(numbers, Import_Data$country_destination_id, main = "Top Ten U.S. Importers 2017", col= assortment)
labels <- Import_Data$country_destination_id
labels <- c("China", "Mexico", "Canada", "Japan", "Germany", "S.Korea", "Vietnam", "UK", "Italy", "India")
lbls <- paste(labels, numbers)
lbls <- paste(lbls,"%",sep="") #adds percentages
par(mar=c(3,3,2,3))
pie(numbers, labels = lbls, main = "Top Ten U.S. Importers 2017", col= assortment)