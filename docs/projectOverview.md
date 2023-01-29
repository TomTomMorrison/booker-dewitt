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

[![](https://mermaid.ink/img/pako:eNrFVF1PgzAU_StNn7c_wBsK6uKyKB8mJiTkjtbRCGW2ZWaB_XcLDC3dnHuTJ-7tveec-9E2OKsIxQ6mwmOwEVAmfBUHoR-8oradz9sWuZ4X-GGIHJSDTPh97Abewl0Nx419bCZXDTqaqedGfuq-uIule7P0dTAQYoIdBrDRTm8fFktvxByM60NG0t5pUaeB_xz7YaQTJS1opij5Fm2rPAwNCCM3isNpfZexLyWe47hOsoME_aip7CUbvWsSjhAjuh7BoEBPj53NoaRoByLLQXQ2LYEVpmMLUn5Wgpi-rOIKMpXyulxTYZ7ocQkqZappGFfoTnMcOhHjuP9Tw7iBJxqQkTWhYGo_kVFJ1V2DH1-PO-zUeVS7NFKtrWxrT3uYTQ2CMOBmCVpOzgryW2cvL9p5cQTURNwJgdZf65R92kWmsNNjgXVBpyFSgap_nbi9x38rGfpWi574Gqbh-gzIp8s1pk3ajowPz3BJhV45op-3HiTBKqclTbCjfwmI9wTrLB0HtarCPc-w8waFpDNcbzvlxxfR8vqEqUocnYcvVt2-qw?type=png)](https://mermaid.live/edit#pako:eNrFVF1PgzAU_StNn7c_wBsK6uKyKB8mJiTkjtbRCGW2ZWaB_XcLDC3dnHuTJ-7tveec-9E2OKsIxQ6mwmOwEVAmfBUHoR-8oradz9sWuZ4X-GGIHJSDTPh97Abewl0Nx419bCZXDTqaqedGfuq-uIule7P0dTAQYoIdBrDRTm8fFktvxByM60NG0t5pUaeB_xz7YaQTJS1opij5Fm2rPAwNCCM3isNpfZexLyWe47hOsoME_aip7CUbvWsSjhAjuh7BoEBPj53NoaRoByLLQXQ2LYEVpmMLUn5Wgpi-rOIKMpXyulxTYZ7ocQkqZappGFfoTnMcOhHjuP9Tw7iBJxqQkTWhYGo_kVFJ1V2DH1-PO-zUeVS7NFKtrWxrT3uYTQ2CMOBmCVpOzgryW2cvL9p5cQTURNwJgdZf65R92kWmsNNjgXVBpyFSgap_nbi9x38rGfpWi574Gqbh-gzIp8s1pk3ajowPz3BJhV45op-3HiTBKqclTbCjfwmI9wTrLB0HtarCPc-w8waFpDNcbzvlxxfR8vqEqUocnYcvVt2-qw)

API Endpoints:
GET PUT POST DELETE Nursery
GET PUT POST DELETE Guardian
GET PUT POST DELETE Child
GET POST DELETE NurseryChildDateRequest
GET POST NurseryDateAvailable
POST NurseryDateBooked 