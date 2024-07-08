fun main() {
    val parser = KJsonParser()

    // generated using https://json-generator.com/
    val json = parser.parse(
        """
        [
          {
            "_id": "668c36c64f719707151e5c46",
            "index": 0,
            "guid": "db5dedcc-3ef4-4ba2-b407-3cc8c158893e",
            "isActive": true,
            "balance": "${'$'}1,502.40",
            "picture": "http://placehold.it/32x32",
            "age": 38,
            "eyeColor": "brown",
            "name": "Joanna Hoover",
            "gender": "female",
            "company": "GREEKER",
            "email": "joannahoover@greeker.com",
            "phone": "+1 (966) 486-2112",
            "address": "845 Ryder Avenue, Loretto, Oregon, 9580",
            "about": "Commodo quis non tempor anim duis mollit in aliquip. Nisi et sint mollit sit minim ex tempor sit aliquip irure ea. Amet do ullamco amet magna cupidatat quis cillum velit mollit sint. Ullamco consequat do aute fugiat deserunt mollit proident sunt duis. Ea consectetur nostrud proident culpa nisi Lorem esse commodo. Incididunt ullamco in dolor consequat sunt est magna in.\r\n",
            "registered": "2021-10-01T11:21:12 +04:00",
            "latitude": 37.425005,
            "longitude": 173.224607,
            "tags": [
              "ex",
              "ex",
              "fugiat",
              "ad",
              "velit",
              "cillum",
              "dolor"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Mcguire Weiss"
              },
              {
                "id": 1,
                "name": "Kelley Sellers"
              },
              {
                "id": 2,
                "name": "Moon Blackwell"
              }
            ],
            "greeting": "Hello, Joanna Hoover! You have 6 unread messages.",
            "favoriteFruit": "banana"
          },
          {
            "_id": "668c36c616c42901d80e119a",
            "index": 1,
            "guid": "33bbb1d2-fc1d-45b5-8532-329c4bc868f1",
            "isActive": false,
            "balance": "${'$'}3,471.33",
            "picture": "http://placehold.it/32x32",
            "age": 28,
            "eyeColor": "blue",
            "name": "Wolf Leblanc",
            "gender": "male",
            "company": "REMOTION",
            "email": "wolfleblanc@remotion.com",
            "phone": "+1 (877) 535-2148",
            "address": "194 Lancaster Avenue, Berlin, Federated States Of Micronesia, 2010",
            "about": "Elit laborum mollit sit eiusmod ullamco. Incididunt irure ut qui ad ex. Ad ullamco eiusmod eu fugiat voluptate quis proident sint qui incididunt qui adipisicing. Cillum et sunt incididunt ut aliqua exercitation dolor commodo incididunt et labore irure laboris. Officia voluptate sit ea mollit aute exercitation amet amet ad. Commodo qui ex duis id. Ut excepteur aliqua ipsum consectetur id esse do labore aliquip deserunt.\r\n",
            "registered": "2024-01-16T05:04:55 +04:00",
            "latitude": 26.987202,
            "longitude": 112.005414,
            "tags": [
              "quis",
              "enim",
              "velit",
              "do",
              "ex",
              "laboris",
              "dolor"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Leach Page"
              },
              {
                "id": 1,
                "name": "Sutton Morales"
              },
              {
                "id": 2,
                "name": "Serena Cleveland"
              }
            ],
            "greeting": "Hello, Wolf Leblanc! You have 5 unread messages.",
            "favoriteFruit": "strawberry"
          },
          {
            "_id": "668c36c6b26d3a2a552cbc23",
            "index": 2,
            "guid": "01872bb8-55da-4d56-9795-b38ad27437e0",
            "isActive": true,
            "balance": "${'$'}2,296.74",
            "picture": "http://placehold.it/32x32",
            "age": 22,
            "eyeColor": "brown",
            "name": "Morgan Campbell",
            "gender": "female",
            "company": "GEEKOLA",
            "email": "morgancampbell@geekola.com",
            "phone": "+1 (849) 489-2241",
            "address": "371 Hendrickson Place, Englevale, New York, 7081",
            "about": "Commodo nisi esse cillum culpa aute enim cillum occaecat sint quis aliqua commodo nostrud aliquip. Occaecat dolore dolor laboris sunt ullamco esse. Magna labore pariatur id sit. Sunt nulla tempor adipisicing irure ad consequat pariatur. Minim sit magna amet magna commodo pariatur cillum eiusmod nulla. Veniam sint eu deserunt est consectetur fugiat sunt.\r\n",
            "registered": "2018-01-01T03:45:25 +04:00",
            "latitude": 59.403524,
            "longitude": -19.474646,
            "tags": [
              "officia",
              "exercitation",
              "aute",
              "voluptate",
              "minim",
              "est",
              "excepteur"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Gonzalez Barrett"
              },
              {
                "id": 1,
                "name": "Lavonne Ward"
              },
              {
                "id": 2,
                "name": "Kirsten Henson"
              }
            ],
            "greeting": "Hello, Morgan Campbell! You have 5 unread messages.",
            "favoriteFruit": "apple"
          },
          {
            "_id": "668c36c69852f82624b9d044",
            "index": 3,
            "guid": "240f3c3b-66c4-4fe1-a99b-5501c30f4cbe",
            "isActive": false,
            "balance": "${'$'}2,994.95",
            "picture": "http://placehold.it/32x32",
            "age": 29,
            "eyeColor": "blue",
            "name": "Jacobs Goff",
            "gender": "male",
            "company": "EARBANG",
            "email": "jacobsgoff@earbang.com",
            "phone": "+1 (901) 417-2618",
            "address": "590 Highland Avenue, Benson, Washington, 9606",
            "about": "Qui minim reprehenderit cupidatat laboris magna id Lorem excepteur laborum proident est dolor. Et laboris culpa deserunt culpa labore ut velit id duis ipsum labore ipsum commodo. Sunt cupidatat fugiat quis aute. Minim ipsum consectetur ut sit magna exercitation nisi sunt culpa dolor Lorem consectetur in nostrud. Ipsum qui irure pariatur commodo id magna cillum do mollit labore ullamco. Sunt ex ex et sunt consequat Lorem culpa ad. Officia exercitation consequat et cillum deserunt nisi mollit quis.\r\n",
            "registered": "2015-04-27T01:37:38 +04:00",
            "latitude": 8.166126,
            "longitude": -128.507939,
            "tags": [
              "mollit",
              "id",
              "aliquip",
              "nisi",
              "non",
              "occaecat",
              "pariatur"
            ],
            "friends": [
              {
                "id": 0,
                "name": "White Tucker"
              },
              {
                "id": 1,
                "name": "Hess Summers"
              },
              {
                "id": 2,
                "name": "Mildred James"
              }
            ],
            "greeting": "Hello, Jacobs Goff! You have 6 unread messages.",
            "favoriteFruit": "apple"
          },
          {
            "_id": "668c36c6e566110c041167a6",
            "index": 4,
            "guid": "9224325d-5a1c-421a-9299-987a5e4f0762",
            "isActive": true,
            "balance": "${'$'}3,517.26",
            "picture": "http://placehold.it/32x32",
            "age": 33,
            "eyeColor": "brown",
            "name": "Ilene Sloan",
            "gender": "female",
            "company": "QUINEX",
            "email": "ilenesloan@quinex.com",
            "phone": "+1 (917) 421-2555",
            "address": "766 Llama Court, Chapin, Louisiana, 1167",
            "about": "Deserunt deserunt laborum deserunt aliquip consectetur cupidatat minim et officia irure anim sunt. Aliquip commodo nisi duis est. Nulla labore magna elit non laborum adipisicing cillum tempor excepteur. Id anim amet adipisicing tempor laborum et pariatur ut mollit cupidatat pariatur officia enim.\r\n",
            "registered": "2019-06-03T02:46:53 +04:00",
            "latitude": -62.894507,
            "longitude": 126.112814,
            "tags": [
              "duis",
              "dolor",
              "deserunt",
              "magna",
              "mollit",
              "voluptate",
              "consequat"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Taylor Russell"
              },
              {
                "id": 1,
                "name": "Lou Camacho"
              },
              {
                "id": 2,
                "name": "Marian Sanders"
              }
            ],
            "greeting": "Hello, Ilene Sloan! You have 5 unread messages.",
            "favoriteFruit": "apple"
          },
          {
            "_id": "668c36c68be506141e385df3",
            "index": 5,
            "guid": "5efb99ae-9853-47ee-accc-688d0a979915",
            "isActive": true,
            "balance": "${'$'}1,471.79",
            "picture": "http://placehold.it/32x32",
            "age": 26,
            "eyeColor": "blue",
            "name": "Francis Dalton",
            "gender": "male",
            "company": "GEEKFARM",
            "email": "francisdalton@geekfarm.com",
            "phone": "+1 (891) 592-2644",
            "address": "261 Stone Avenue, Kanauga, Missouri, 7298",
            "about": "Elit dolor laborum fugiat nostrud et. Qui et adipisicing consequat quis sunt dolor enim commodo. Amet esse sint irure nisi velit aliqua esse proident qui officia magna nostrud qui. Amet nisi adipisicing excepteur enim eiusmod adipisicing nostrud quis magna ullamco Lorem eiusmod fugiat irure.\r\n",
            "registered": "2021-10-28T04:15:44 +04:00",
            "latitude": -83.807137,
            "longitude": -146.089158,
            "tags": [
              "quis",
              "ipsum",
              "incididunt",
              "excepteur",
              "tempor",
              "ullamco",
              "tempor"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Taylor Conway"
              },
              {
                "id": 1,
                "name": "Anderson Wilkins"
              },
              {
                "id": 2,
                "name": "William Marquez"
              }
            ],
            "greeting": "Hello, Francis Dalton! You have 6 unread messages.",
            "favoriteFruit": "apple"
          },
          {
            "_id": "668c36c65e93515ff49cda69",
            "index": 6,
            "guid": "f8806713-43e5-4590-910b-6bce19cacf18",
            "isActive": false,
            "balance": "${'$'}1,830.87",
            "picture": "http://placehold.it/32x32",
            "age": 33,
            "eyeColor": "blue",
            "name": "Josie Blake",
            "gender": "female",
            "company": "VALPREAL",
            "email": "josieblake@valpreal.com",
            "phone": "+1 (961) 419-2320",
            "address": "249 Dunham Place, Otranto, Connecticut, 7317",
            "about": "Fugiat aliqua consequat exercitation reprehenderit. Labore voluptate qui cupidatat et exercitation anim. Magna adipisicing ad aliquip nisi enim pariatur aliquip culpa id. Ea duis eiusmod pariatur ad consectetur ut dolor ullamco. Lorem occaecat magna excepteur excepteur amet nisi irure et eu nulla mollit ipsum reprehenderit velit. Enim et ullamco consequat reprehenderit magna et. Et ipsum sunt ea officia eu reprehenderit culpa.\r\n",
            "registered": "2016-07-04T06:05:49 +04:00",
            "latitude": -26.657293,
            "longitude": -90.815314,
            "tags": [
              "dolor",
              "minim",
              "cillum",
              "anim",
              "consectetur",
              "dolore",
              "ex"
            ],
            "friends": [
              {
                "id": 0,
                "name": "Lora Mcgee"
              },
              {
                "id": 1,
                "name": "Marjorie Dickerson"
              },
              {
                "id": 2,
                "name": "Araceli Ashley"
              }
            ],
            "greeting": "Hello, Josie Blake! You have 8 unread messages.",
            "favoriteFruit": "strawberry"
          }
        ]
    """.trimIndent())

    for (filterKey in json.filterKeys { it == "tags" }) {
        println(filterKey)
    }
}