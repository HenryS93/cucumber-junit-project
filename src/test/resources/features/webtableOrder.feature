
Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table



  Scenario Template: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "<ProductType>"
    And user enters quantity <Quantity>
    And user enters customer name "<FullName>"
    And user enters street "<Street>"
    And user enters city "<City>"
    And user enters state "<State>"
    And user enters zipcode "<Zipcode>"
    And user selects credit card type "<CardType>"
    And user enters credit card number "<CardNo>"
    And user enters expiry date "<ExpDate>"
    And user enters process order button
    Then user should see "<ExpectedFullName>" in first row of the web table



    Examples:Nopor Stars
      | ProductType | Quantity | FullName        | Street           | City            | State            | Zipcode | CardType         | CardNo           | ExpDate | ExpectedFullName |
      | Familybea   | 2        | Lena Paul       | 1 Milf           | Best            | OfAllTimeState   | 00001   | Visa             | 123812830948102  | 03/24   | Lena Paul        |
      | MoneyCog    | 3        | Mia Khalifa     | 2 HotArab        | Best            | BestHugeTits     | 00002   | Mastercard       | 834729611539     | 09/24   | Mia Khalifa      |
      | Screenable  | 1        | Lauren Phillips | 3 LikesGangBangs | GangLand        | LikesItRough     | 0003    | American Express | 2093420398402    | 01/25   | Lauren Phillips  |
      | Familybea   | 2        | Mia Makolva     | 1231 Milf        | BestRussian     | OfAllTimeState   | 00001   | MasterCard       | 123812830948102  | 07/23   | Mia Makolva      |
      | MoneyCog    | 3        | Lisa Ann        | 223 HotMilf      | BestOfAllTime   | BestHugeTits&Ass | 012302  | Visa             | 834723121539     | 03/25   | Lisa Ann         |
      | Screenable  | 1        | KarmaRx         | 3 LovesGangBangs | GangLand        | LikesItRough     | 3003    | American Express | 20231220398402   | 02/25   | KarmaRx          |
      | Familybea   | 5        | Siri            | 1 RedHead        | BestNaturalTits | OfAllTimeState   | 012301  | Visa             | 1238128302546677 | 03/25   | Siri             |
      | MoneyCog    | 6        | Angelica Heart  | 2 TurkishWhore   | BestDayOne      | BestHugeTits     | 234002  | American Express | 8347865967995543 | 09/24   | Angelica Heart   |
      | Screenable  | 2        | Alena Croft     | 12343 BlondeMilf | GangLand        | LikesGangs       | 03243   | American Express | 2023426577398402 | 09/25   | Alena Croft      |
      | Familybea   | 4        | Angela White    | HotestMilf       | BestNaturalTits | GOAT             | 452001  | Visa             | 12682650248102   | 05/25   | Angela White     |
      | MoneyCog    | 2        | Sophie Dee      | 2315 GreatMilf   | OneOfAKind      | BestHugeTits     | 76872   | Mastercard       | 6870473611539    | 02/24   | Sophie Dee       |
      | Screenable  | 7        | Jada Fire       | 3 LikesGangBangs | GangLand        | LikesItRough     | 234203  | American Express | 2045646398402    | 01/25   | Jada Fire        |


    Examples: That live in GangLand
      | ProductType | Quantity | FullName        | Street           | City            | State            | Zipcode | CardType         | CardNo           | ExpDate | ExpectedFullName |
      | Familybea   | 2        | Lena Paul       | 1 Milf           | Best            | OfAllTimeState   | 00001   | Visa             | 123812830948102  | 03/24   | Lena Paul       |
      | MoneyCog    | 3        | Mia Khalifa     | 2 HotArab        | Best            | BestHugeTits     | 00002   | Mastercard       | 834729611539     | 09/24   | Mia Khalifa      |
      | Screenable  | 1        | Lauren Phillips | 3 LikesGangBangs | GangLand        | LikesItRough     | 0003    | American Express | 2093420398402    | 01/25   | Lauren Phillips  |
      | Familybea   | 2        | Mia Makolva     | 1231 Milf        | BestRussian     | OfAllTimeState   | 00001   | MasterCard       | 123812830948102  | 07/23   | Mia Makolva      |
      | MoneyCog    | 3        | Lisa Ann        | 223 HotMilf      | BestOfAllTime   | BestHugeTits&Ass | 012302  | Visa             | 834723121539     | 03/25   | Lisa Ann         |
      | Screenable  | 1        | KarmaRx         | 3 LovesGangBangs | GangLand        | LikesItRough     | 3003    | American Express | 20231220398402   | 02/25   | KarmaRx          |
      | Familybea   | 5        | Siri            | 1 RedHead        | BestNaturalTits | OfAllTimeState   | 012301  | Visa             | 1238128302546677 | 03/25   | Siri             |
      | MoneyCog    | 6        | Angelica Heart  | 2 TurkishWhore   | BestDayOne      | BestHugeTits     | 234002  | American Express | 8347865967995543 | 09/24   | Angelica Heart   |
      | Screenable  | 2        | Alena Croft     | 12343 BlondeMilf | GangLand        | LikesGangs       | 03243   | American Express | 2023426577398402 | 09/25   | Alena Croft      |
      | Familybea   | 4        | Angela White    | HotestMilf       | BestNaturalTits | GOAT             | 452001  | Visa             | 12682650248102   | 05/25   | Angela White     |
      | MoneyCog    | 2        | Sophie Dee      | 2315 GreatMilf   | OneOfAKind      | BestHugeTits     | 76872   | Mastercard       | 6870473611539    | 02/24   | Sophie Dee       |
      | Screenable  | 7        | Jada Fire       | 3 LikesGangBangs | GangLand        | LikesItRough     | 234203  | American Express | 2045646398402    | 01/25   | Jada Fire        |