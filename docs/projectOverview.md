### What is the application?
It is a location based booking system for nurseries.\
Nurseries can flag open slots on their calendar for parents to book and pay for.

### Why create this application?
The average cost of nursery in N.I is £169 p/week.\
The standard is to book for a duration of time, commonly a year.\
This leads to occasions when children are booked in to nursery but cannot attend, leaving empty spaces.\
Parents who require urgent or irregular daycare facilities then struggle to find availability.

### How will the application work?
Guest users can see registered nurseries in their area and their availability but cannot place bookings.\
#### To create a profile a user must include:
  - Name
  - Address
  - Email
  - Contact Number
  - Children

#### To add children a user must include:
  - Name
  - DOB (Must be older than 1 and younger than 4)

#### To register on the application a nursery must include:
  - Name
  - Address
  - Email
  - Contact Number
  - Registration Number

#### To book a slot at a nursery, the user must select a:
  - Date
  - Drop-off time
  - Pick-up time
  - Child
The user must then:
  - Complete payment

Users can add notifications for when certain nurseries have availability for selected dates.

![ERD][booker-dewitt-erd.png]

[![](https://mermaid.ink/img/pako:eNrFVN1OgzAUfpWm1-4FuGOCumzZFIaJCQk5o0chAp1tmVm2vbsHNiLjR72TK9rz_fX0pAceS4Hc4qicFN4U5GGxDDzf9V7Y8TiZyAOzHcdzfZ9ZLAHdq16WkWOv3ch-tmcLe7pwCQxCEPo-sD1nZi9HxLrl24fZwhkrNlY16GzouU-B66-Jsc0gxh9IvXwaM4wNMVqcQ1gwlgqqqRQy9jiv1gXkyHag4gRUtcYc0qy9sQWtP6US7b1YFgZiExVlvkHVrlBfFGodkU1aGHZHHqcqRNPX_8zQ3E4vA2uxrixSs7-KIbWpBup7r9Y9X-uwavdoQm467ID6ErUkShJoR6cYSZqJsY4OzctwFAHmKkpPltKWijj7Ua_OmP3uw_6sOl2t5u5oFy8KlXQEO5oO2GQ4nP18rBqp8KNEbTrGrPXxG56jonET9EjU3iE3CeYYcot-Baj3kBOLcOW20nRFaqTi1itkGm84lEb6-yLmllElNqDLW3NBnb4Atg2GPQ)](https://mermaid.live/edit#pako:eNrFVN1OgzAUfpWm1-4FuGOCumzZFIaJCQk5o0chAp1tmVm2vbsHNiLjR72TK9rz_fX0pAceS4Hc4qicFN4U5GGxDDzf9V7Y8TiZyAOzHcdzfZ9ZLAHdq16WkWOv3ch-tmcLe7pwCQxCEPo-sD1nZi9HxLrl24fZwhkrNlY16GzouU-B66-Jsc0gxh9IvXwaM4wNMVqcQ1gwlgqqqRQy9jiv1gXkyHag4gRUtcYc0qy9sQWtP6US7b1YFgZiExVlvkHVrlBfFGodkU1aGHZHHqcqRNPX_8zQ3E4vA2uxrixSs7-KIbWpBup7r9Y9X-uwavdoQm467ID6ErUkShJoR6cYSZqJsY4OzctwFAHmKkpPltKWijj7Ua_OmP3uw_6sOl2t5u5oFy8KlXQEO5oO2GQ4nP18rBqp8KNEbTrGrPXxG56jonET9EjU3iE3CeYYcot-Baj3kBOLcOW20nRFaqTi1itkGm84lEb6-yLmllElNqDLW3NBnb4Atg2GPQ)

API Endpoints:
GET PUT POST DELETE Nursery
GET PUT POST DELETE Guardian
GET PUT POST DELETE Child
GET POST DELETE NurseryChildDateRequest
GET POST NurseryDateAvailable
POST NurseryDateBooked 