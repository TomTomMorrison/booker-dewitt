### What is the application?
It is a location based booking system for nurseries.\
Nurseries can flag open slots on their calendar for parents to request to book.

### Why create this application?
The average cost of nursery in N.I is £169 p/week.\
The standard is to book for a duration of time, commonly a year.\
This leads to occasions when children are booked in to nursery but cannot attend, leaving empty spaces.\
Parents who require urgent or irregular daycare facilities then struggle to find availability.

### How will the application work?
Guest users can see registered nurseries in their area and their availability but cannot place booking requests.\

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

#### MVP:
  - A user (Guardian / Nursery) can create an account & login.
  - A user (Nursery) can add available dates.
  - A user (Guardian) can place a booking request for an available date.

#### Stretch Goals:
  - A user (Nursery) can accept a booking request for an available date.
  - A user (Guardian) can complete payment for an accepted booking request.
  - A user (Guardian) can add preferences and receive notifications for selected Nurseries.

Users can add notifications for when certain nurseries have availability for selected dates.

#### ERD:

[![](https://mermaid.ink/img/pako:eNqVVNuOmzAQ_RXLz7s_wBsttI2arlIIlSohWRM82VjiVttsFSX59w63FhyipbyYGc85c-YiX3hWSeQeRx0oeNVQpKW_24kkDiPxkkR0_GTX6_Pz9cpGv8eUmUR9Tvwo2Pgv74S5ZEEQhXHMPHaCx2yXh3FTuorCfvibrf9hG4rA34dtOEi5yHvreUdbfPyy2QYjfW-sDxlU9BFiLkJE4fckjPcENJhjZlGKY6VJk6P11nck3vv7JB6yrCJeAi6SrxPqMY2_GjQkNC2XWndJS8aUpHK0gpztvrY21LVoyCPoQpWWfSLvbYYfR_Wf8GHwdyjWwaTUaAx7A52dQLeuTNnz1K4rY9vl_ufrePv5LbOWUOCUQlYHZlVBLYGiHvDOVlxmRbw2oKWCcloNKTupXN4VuGrEyzqHOQkJFkUrcKpyIR8pfAOVwyHHDmPmlwS0jbmfgLNKDyYxY3bUsFl3ykbTcV6VvF_qPuf91owwZ7bjyj2GuRNmDAvSP3fVYMzvSsu5N6tKC5mlKooD6vndsI5OFWzy8SdeoKZckh7bTl7K7QkLTLlHvxKP0OQ25QSkUGhsFZ_LjHtHyA0-8aZuuzs80Y43lMpW-q8TO_Nb_6x3r_vtD65v83A?type=png)](https://mermaid.live/edit#pako:eNqVVNuOmzAQ_RXLz7s_wBsttI2arlIIlSohWRM82VjiVttsFSX59w63FhyipbyYGc85c-YiX3hWSeQeRx0oeNVQpKW_24kkDiPxkkR0_GTX6_Pz9cpGv8eUmUR9Tvwo2Pgv74S5ZEEQhXHMPHaCx2yXh3FTuorCfvibrf9hG4rA34dtOEi5yHvreUdbfPyy2QYjfW-sDxlU9BFiLkJE4fckjPcENJhjZlGKY6VJk6P11nck3vv7JB6yrCJeAi6SrxPqMY2_GjQkNC2XWndJS8aUpHK0gpztvrY21LVoyCPoQpWWfSLvbYYfR_Wf8GHwdyjWwaTUaAx7A52dQLeuTNnz1K4rY9vl_ufrePv5LbOWUOCUQlYHZlVBLYGiHvDOVlxmRbw2oKWCcloNKTupXN4VuGrEyzqHOQkJFkUrcKpyIR8pfAOVwyHHDmPmlwS0jbmfgLNKDyYxY3bUsFl3ykbTcV6VvF_qPuf91owwZ7bjyj2GuRNmDAvSP3fVYMzvSsu5N6tKC5mlKooD6vndsI5OFWzy8SdeoKZckh7bTl7K7QkLTLlHvxKP0OQ25QSkUGhsFZ_LjHtHyA0-8aZuuzs80Y43lMpW-q8TO_Nb_6x3r_vtD65v83A)

#### API Specification:

#### NURSERIES
`GET /nurseries`
Return a list of all nurseries

Response 200
```json
[
  {
    "id": 1,
    "name": "Nursery 1",
    "email": "nursery1@mail.com",
    "contact_number": "02880576923",
    "address_id": 1
  },
  {
    "id": 2,
    "name": "Nursery 2",
    "email": "nursery2@mail.com",
    "contact_number": "02880198564",
    "address_id": 2
  }
]
```

---

`GET /nurseries/{nursery_id}`
Return a nursery

Response 200
```json
  {
  "id": 1,
  "name": "Nursery 1",
  "email": "nursery1@mail.com",
  "contact_number": "02880576923",
  "address_id": 1
  }
```

---

`GET /nurseries/available-dates`
Return a list of all available dates for all nurseries

Response 200
```json
[
  {
    "id": 1,
    "date": "04/09/2023",
    "nursery_id": 4,
    "status_id": 1
  },
  {
    "id": 2,
    "date": "05/09/2023",
    "nursery_id": 3,
    "status_id": 1
  }
]

```

---

`GET /nurseries/{nursery_id}/available-dates`
Return a list of all available dates by nursery id

Response 200
```json
[
  {
    "id": 1,
    "date": "04/09/2023",
    "nursery_id": 4,
    "status_id": 1
  }
]

```

---

`GET /nurseries/available-dates/{nursery_date_available_id}`
Return an available date by nursery date available id

Response 200
```json
{
  "id": 1,
  "date": "04/09/2023",
  "nursery_id": 4,
  "status_id": 1
}


```

---

`GET /nurseries/{nursery_id}/booking-requests`
Return all booking requests by nursery id

Response 200
```json
[
  {
    "id": 1,
    "date": "04/09/2023",
    "nursery_id": 4,
    "status_id": 1
  },
  {
    "id": 2,
    "date": "05/09/2023",
    "nursery_id": 4,
    "status_id": 1
  }
]


```

---

`GET /nurseries/{nursery_id}/booking-requests/{status_id}`
Return all booking requests by nursery id & status id

Response 200
```json
[
  {
    "id": 1,
    "date": "04/09/2023",
    "nursery_id": 4,
    "status_id": 1
  },
  {
    "id": 2,
    "date": "05/09/2023",
    "nursery_id": 4,
    "status_id": 1
  }
]


```

---

`POST /nurseries`
Create a nursery

Request
```json
{
  "name": "New Nursery",
  "email": "newNursery@mail.com",
  "password": "password123",
  "contact_number": "02880676881",
  "address": "1 High Street",
  "city": "Belfast",
  "postcode": "BT1 5HL"
}
```
Response - `201 Created`

---

`POST /nurseries/available-dates`
Create an available date

Request
```json
{
  "date": "04/09/2023"
}
```
Response - `201 Created`

---

`PATCH /nursery/{nursery_id}`
Update a nursery by id

Request
```json
{
"password": "Password123"
}
```
Response - `200 OK`

---

`PATCH /nurseries/available-dates/{nursery_date_available_id}`
Update an available date by id

Request
```json
{
  "date": "05/09/2023",
  "status_id": 2
}
```
Response - `200 OK`

---

`PATCH /nurseries/booking-requests/{nursery_child_date_available_request_id}`
Update a booking request by id

Request
```json
{
  "status_id": 4
}
```
Response - `200 OK`

---

`DELETE /nursery/{nursery_id}`
Delete a nursery by id

Response - `204 No Content`

---

#### GUARDIANS
`GET /guardians`
Return a list of all guardians

Response 200
```json
[
  {
    "id": 1,
    "name": "Tony Soprano",
    "email": "tsoprano@mail.com",
    "contact_number": "0975839284",
    "address_id": 1
  },
  {
    "id": 2,
    "name": "Vito Corleone",
    "email": "vcorleone@mail.com",
    "contact_number": "6985769804",
    "address_id": 2
  }
]
```

---

`GET /guardians/{guardian_id}`
Return a guardian

Response 200
```json
  {
  "id": 1,
  "name": "Tony Soprano",
  "email": "tsoprano@mail.com",
  "contact_number": "0975839284",
  "address_id": 1
}
```

---

`POST /guardians`
Create a guardian

Request
```json
{
  "name": "New Guardian",
  "email": "newGuardian@mail.com",
  "password": "password123",
  "contact_number": "07012345697",
  "address": "2 High Street",
  "city": "Belfast",
  "postcode": "BT1 5HL"
}
```
Response - `201 Created`

---

`POST /guardians/booking-requests`
Create a booking request

Request
```json
{
  "date": "01/09/2023",
  "child_id": 2,
  "nursery_date_available_id": 1
}
```
Response - `201 Created`

---

`PATCH /guardian/{guardian_id}`
Update a guardian by id

Request
```json
{
  "password": "Password123"
}
```
Response - `200 OK`

---

`PATCH /guardian/booking-requests/{nursery_child_date_available_request_id}`
Update a booking request by id

Request
```json
{
  "status_id": 5
}
```
Response - `200 OK`

---

`DELETE /guardian/{guardian_id}`
Delete a guardian by id

Response - `204 No Content`

---

#### CHILDREN
`GET /children`
Return a list of all children

Response 200
```json
[
  {
    "id": 1,
    "name": "Anthony Soprano",
    "dob": "12/02/2021"
  },
  {
    "id": 2,
    "name": "Michael Corleone",
    "dob": "31/06/2020"
  }
]
```

---

`GET /children/{guardian_id}`
Return a list of all children by guardian id

Response 200
```json
[
  {
    "id": 1,
    "name": "Anthony Soprano",
    "dob": "12/02/2021"
  },
  {
    "id": 3,
    "name": "Meadow Soprano",
    "dob": "02/04/2021"
  }
]
```

---

`GET /children/{child_id}`
Return a child by id

Response 200
```json
  {
  "id": 1,
  "name": "Anthony Soprano",
  "dob": "12/02/2021"
}
```

---

`POST /children`
Create a child

Request
```json
{
  "name": "Meadow Sopran",
  "dob": "02/04/2021"
}
```
Response - `201 Created`

---

`PATCH /children/{child_id}`
Update a child by id

Request
```json
{
  "name": "Meadow Soprano"
}
```
Response - `200 OK`

---

`DELETE /children/{child}`
Delete a child by id

Response - `204 No Content`

---
