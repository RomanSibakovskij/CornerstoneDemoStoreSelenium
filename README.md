# CornerstoneDemoStoreSelenium

Simple Selenium test suite on user account registration/login/logout, account information update, user address addition/update/removal, single category product display view, product addition (removal from) to product compare list, basic product addition to cart/checkout, order submission validation, add ordered product review. The test suite captures screenshots at the end of test case run (for logging purposes). Sometimes user account creation may fail with valid input (due o possible backend load issues).

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List

//user navigation to register page test

1.	//Test 001 -> user navigation to register page test

//valid user account creation test (due to possible backend server issues, the user account creation may fail, it's not due to test script in any way)

1.	//Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	//Test 002a -> invalid user account creation test - no user email
2.	//Test 002b -> invalid user account creation test - no user password / confirm password
3.	//Test 002c -> invalid user account creation test - no user country
4.	//Test 002d -> invalid user account creation test - no user first name
5.	//Test 002e -> invalid user account creation test - no user first name
6.	//Test 002f -> invalid user account creation test - no user address
7.	//Test 002g -> invalid user account creation test - no user city
8.	//Test 002h -> invalid user account creation test - no user post code
9.	//Test 002i -> invalid user account creation test - no user phone

//too short singular input

1.	//Test 002j -> invalid user account creation test - too short user email (1 char -> name, domain) (the user account gets created, test has failed)
2.	//Test 002k -> invalid user account creation test - too short user password / confirm password (6 chars)
3.	//Test 002l -> invalid user account creation test - too short user first name (1 char) (the user account gets created, test has failed)
4.	//Test 002m -> invalid user account creation test - too short user last name (1 char) (the user account gets created, test has failed)
5.	//Test 002n -> invalid user account creation test - too short user address (3 chars) (the user account gets created, test has failed)
6.	//Test 002o -> invalid user account creation test - too short user city (1 char) (the user account gets created, test has failed)
7.	//Test 002p -> invalid user account creation test - too short user post code (4 digits) (the user account gets created, test has failed)
8.	//Test 002q -> invalid user account creation test - too short user phone (2 digits) (the user account gets created, test has failed)

//too long singular input

1.	//Test 002r -> invalid user account creation test - too long user email (100 chars -> name, domain)
2.	//Test 002s -> invalid user account creation test - too long user password / confirm password (75 chars) (the user account gets created, test has failed)
3.	//Test 002t -> invalid user account creation test - too long user first name (100 chars) (the user account gets created, test has failed)
4.	//Test 002u -> invalid user account creation test - too long user last name (100 chars) (the user account gets created, test has failed)
5.	//Test 002v -> invalid user account creation test - too long user address (100 chars) (the user account gets created, test has failed)
6.	//Test 002w -> invalid user account creation test - too long user city (100 chars) (the user account gets created, test has failed)
7.	//Test 002x -> invalid user account creation test - too long user post code (6 digits) (the user account gets created, test has failed)
8.	//Test 002y -> invalid user account creation test - too long user phone (6 digits) (the user account gets created, test has failed)

//invalid singular input format

1.	//Test 002z -> invalid user account creation test - invalid user email format (missing '@')
2.	//Test 002aa -> invalid user account creation test - existing user email (used beforehand in manual testing)
3.	//Test 002ab -> invalid user account creation test - invalid user password and confirm password format (strings only)
4.	//Test 002ac -> invalid user account creation test - mismatching user confirm password
5.	//Test 002ad -> invalid user account creation test - invalid user first name format (special symbols only) (the user account got created, test has failed)
6.	//Test 002ae -> invalid user account creation test - invalid user last name format (special symbols only) (the user account got created, test has failed)
7.	//Test 002af -> invalid user account creation test - invalid user address format (special symbols only) (the user account got created, test has failed)
8.	//Test 002ag -> invalid user account creation test - invalid user city format (special symbols only) (the user account got created, test has failed)
9.	//Test 002ah -> invalid user account creation test - invalid user post code format (special symbols only) (the user account got created, test has failed)
10.	//Test 002ai -> invalid user account creation test - invalid user phone format (special symbols only) (the user account got created, test has failed)

//valid edit user account data tests

1.	//Test 003 -> valid edit user account data (with login email) test
2.	//Test 003a -> valid edit user account data (with login password) test

//invalid edit user account data tests

//no singular input

1.	//Test 003b -> invalid edit user account data test - no edited first name
2.	//Test 003c -> invalid edit user account data test - no edited last name
3.	//Test 003d -> invalid edit user account data test - no edited email
4.	//Test 003e -> invalid edit user account data test - no edited password / confirm password (the account editing wasn't aborted, test has failed)
5.	//Test 003f -> invalid edit user account data test - no current password (the account editing wasn't aborted, test has failed)

//too short singular input

1.	//Test 003g -> invalid edit user account data test - too short edited first name (1 char) (the account editing wasn't aborted, test has failed)
2.	//Test 003h -> invalid edit user account data test - too short edited last name (1 char) (the account editing wasn't aborted, test has failed)
3.	//Test 003i -> invalid edit user account data test - too short edited email (1 char -> name, domain) (the account editing wasn't aborted, test has failed)
4.	//Test 003j -> invalid edit user account data test - too short edited password / confirm password (6 chars) (the account editing wasn't aborted, test has failed)

//too long singular input

1.	//Test 003k -> invalid edit user account data test - too long edited first name (100 chars) (the account editing wasn't aborted, test has failed)
2.	//Test 003l -> invalid edit user account data test - too long edited last name (100 chars) (the account editing wasn't aborted, test has failed)
3.	//Test 003m -> invalid edit user account data test - too long edited email (100 chars -> name, domain)
4.	//Test 003n -> invalid edit user account data test - too long edited password / confirm password (75 chars) (the account editing wasn't aborted, test has failed)

//invalid singular input format

1.	//Test 003o -> invalid edit user account data test - invalid edited first name format (special symbols only) (the account editing wasn't aborted, test has failed)
2.	//Test 003p -> invalid edit user account data test - invalid edited last name format (special symbols only) (the account editing wasn't aborted, test has failed)
3.	//Test 003q -> invalid edit user account data test - invalid edited email format (missing '@')
4.	//Test 003r -> invalid edit user account data test - existing email (used beforehand in manual testing) (the account editing wasn't aborted, test has failed)
5.	//Test 003s -> invalid edit user account data test - invalid edited password / confirm password (strings only) (the account editing wasn't aborted, test has failed)

//valid second user address addition test

1.	//Test 004 -> valid user second address addition test

//invalid second user address addition tests

//no singular input

1.	//Test 004a -> invalid user second address addition test - no user country
2.	//Test 004b -> invalid user second address addition test - no user first name
3.	//Test 004c -> invalid user second address addition test - no user last name
4.	//Test 004d -> invalid user second address addition test - no user address
5.	//Test 004e -> invalid user second address addition test - no user city
6.	//Test 004f -> invalid user second address addition test - no user state
7.	//Test 004g -> invalid user second address addition test - no user post code
8.	//Test 004h -> invalid user second address addition test - no user phone

//too short singular input

1.	//Test 004i -> invalid user second address addition test - too short user first name (1 char) (new address addition wasn't aborted, test has failed)
2.	//Test 004j -> invalid user second address addition test - too short user last name (1 char) (new address addition wasn't aborted, test has failed)
3.	//Test 004k -> invalid user second address addition test - too short user address (3 chars) (new address addition wasn't aborted, test has failed)
4.	//Test 004l -> invalid user second address addition test - too short user city (1 char) (new address addition wasn't aborted, test has failed)
5.	//Test 004m -> invalid user second address addition test - too short user post code (4 digits) (new address addition wasn't aborted, test has failed)
6.	//Test 004n -> invalid user second address addition test - too short user phone (2 digits) (new address addition wasn't aborted, test has failed)

//too long singular input

1.	//Test 004o -> invalid user second address addition test - too long user first name (100 chars) (new address addition wasn't aborted, test has failed)
2.	//Test 004p -> invalid user second address addition test - too long user last name (100 chars) (new address addition wasn't aborted, test has failed)
3.	//Test 004q -> invalid user second address addition test - too long user address (100 chars) (new address addition wasn't aborted, test has failed)
4.	//Test 004r -> invalid user second address addition test - too long user city (100 chars) (new address addition wasn't aborted, test has failed)
5.	//Test 004s -> invalid user second address addition test - too long user post code (6 digits) (new address addition wasn't aborted, test has failed)
6.	//Test 004t -> invalid user second address addition test - too long user phone (30 digits) (new address addition wasn't aborted, test has failed)

//invalid singular input format

1.	//Test 004u -> invalid user second address addition test - invalid user first name format (special symbols only) (new address addition wasn't aborted, test has failed)
2.	//Test 004v -> invalid user second address addition test - invalid user last name format (special symbols only) (new address addition wasn't aborted, test has failed)
3.	//Test 004w -> invalid user second address addition test - invalid user address format (special symbols only) (new address addition wasn't aborted, test has failed)
4.	//Test 004x -> invalid user second address addition test - invalid user city format (special symbols only) (new address addition wasn't aborted, test has failed)
5.	//Test 004y -> invalid user second address addition test - invalid user post code format (special symbols only) (new address addition wasn't aborted, test has failed)
6.	//Test 004z -> invalid user second address addition test - invalid user phone format (special symbols only) (new address addition wasn't aborted, test has failed)

//valid update user address test

1.	//Test 005 -> valid update user address test

//invalid update user address tests

//no singular input

1.	//Test 005a -> invalid update user address test - no country
2.	//Test 005b -> invalid update user address test - no user first name
3.	//Test 005c -> invalid update user address test - no user last name
4.	//Test 005d -> invalid update user address test - no user address
5.	//Test 005e -> invalid update user address test - no user city
6.	//Test 005f -> invalid update user address test - no user state
7.	//Test 005g -> invalid update user address test - no user post code
8.	//Test 005h -> invalid update user address test - no user phone

//too short singular input

1.	//Test 005i -> invalid update user address test - too short user first name (1 char) (the user address edit hasn't been aborted, test has failed)
2.	//Test 005j -> invalid update user address test - too short user last name (1 char) (the user address edit hasn't been aborted, test has failed)
3.	//Test 005k -> invalid update user address test - too short user address (3 chars) (the user address edit hasn't been aborted, test has failed)
4.	//Test 005l -> invalid update user address test - too short user city (1 char) (the user address edit hasn't been aborted, test has failed)
5.	//Test 005m -> invalid update user address test - too short user post code (4 digits) (the user address edit hasn't been aborted, test has failed)
6.	//Test 005n -> invalid update user address test - too short user phone (2 digits) (the user address edit hasn't been aborted, test has failed)

//too long singular input

1.	//Test 005o -> invalid update user address test - too long user first name (100 chars) (the user address edit hasn't been aborted, test has failed)
2.	//Test 005p -> invalid update user address test - too long user last name (100 chars) (the user address edit hasn't been aborted, test has failed)
3.	//Test 005q -> invalid update user address test - too long user address (100 chars) (the user address edit hasn't been aborted, test has failed)
4.	//Test 005r -> invalid update user address test - too long user city (100 chars) (the user address edit hasn't been aborted, test has failed)
5.	//Test 005s -> invalid update user address test - too long user post code (6 digits) (the user address edit hasn't been aborted, test has failed)
6.	//Test 005t -> invalid update user address test - too long user phone (30 digits) (the user address edit hasn't been aborted, test has failed)

//invalid singular input format

1.	//Test 005u -> invalid update user address test - invalid user first name format (special symbols only) (the user address edit hasn't been aborted, test has failed)
2.	//Test 005v -> invalid update user address test - invalid user last name format (special symbols only) (the user address edit hasn't been aborted, test has failed)
3.	//Test 005w -> invalid update user address test - invalid user address format (special symbols only) (the user address edit hasn't been aborted, test has failed)
4.	//Test 005x -> invalid update user address test - invalid user city format (special symbols only) (the user address edit hasn't been aborted, test has failed)
5.	//Test 005y -> invalid update user address test - invalid user post code format (special symbols only) (the user address edit hasn't been aborted, test has failed)
6.	//Test 005z -> invalid update user address test - invalid user phone format (special symbols only) (the user address edit hasn't been aborted, test has failed)

//valid user address removal test

1.	//Test 006 -> valid user address removal test

//valid edit user logout test

1.	//Test 007 -> valid user logout test

//valid edit user login tests

1.	//Test 008 -> valid user login test
2.	//Test 008a -> valid user login with edited login email test
3.	//Test 008b -> valid user login with edited login password test

//invalid user login tests

//no singular input

1.	//Test 008c -> invalid user login test - no login email
2.	//Test 008d -> invalid user login test - no login password

//invalid singular input

1.	//Test 008e -> invalid user login test - invalid login email
2.	//Test 008f -> invalid user login test - invalid login password

//single most popular product addition to cart tests

1.	//Test 009 -> single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
2.	//Test 009a -> single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)

//multiple most popular products addition to cart tests

1.	//Test 009b -> multiple most popular products ("Tiered Wire Basket") addition to cart test method (as a guest)
2.	//Test 009c -> multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)

//single new product addition to cart tests

1.	//Test 010 -> single new product ("Smith Journal 13") addition to cart test method (as a guest)
2.	//Test 010a -> single new product ("Kinfolk Issue 16") addition to cart test method (as a registered user)

//multiple new products addition to cart tests

1.	//Test 010b -> multiple new products ("Smith Journal 13") addition to cart test method (as a guest)
2.	//Test 010c -> multiple new product ("Kinfolk Issue 16") addition to cart test method (as a registered user)

//single category dashboard page single product addition to cart tests

1.	//Test 011 -> single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
2.	//Test 011a -> single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)

//single category dashboard page multiple products addition to cart tests

1.	//Test 011b -> single category dashboard page set multiple products ("Floor Cleaner") addition to cart test method (as a guest)
2.	//Test 011c -> single category dashboard page set multiple products ("Openhouse No. 3") addition to cart test method (as a registered user)

//single searched product addition to cart tests

1.	//Test 012 -> single searched product ("Living with Plants") addition to cart test method (as a guest)
2.	//Test 012a -> single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)

//multiple searched products addition to cart tests

1.	//Test 012b -> multiple searched products ("Orbit Terrarium (Large)") addition to cart test method (as a guest)
2.	//Test 012c -> multiple searched products ("Dustpan & Brush") addition to cart test method (as a registered user)

//multiple products addition to compare list tests

1.	//Test 013 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
2.	//Test 013a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition to compare list test method (as a registered user)

//add products from compare list to cart tests

1.	//Test 014 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
2.	//Test 014a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to cart test method (as a registered user)

//product removal from compare list tests

1.	//Test 015 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") removal from compare list test method (as a guest)
2.	//Test 015a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") removal from compare list test method (as a registered user)

//single most popular product addition to check out tests

1.	//Test 016 -> single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
2.	//Test 016a -> single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)

//multiple most popular products addition to check out tests

1.	//Test 016b -> multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
2.	//Test 016c -> multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)

//single new product addition to check out tests

1.	//Test 017 -> single new product ("Smith Journal 13") addition to check out test method (as a guest)
2.	//Test 017a -> single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)

//multiple new products addition to check out tests

1.	//Test 017b -> multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
2.	//Test 017c -> multiple new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)

//single category dashboard page single product addition to check out tests

1.	//Test 018 -> single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
2.	//Test 018a -> single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)

//single category dashboard page multiple products addition to check out tests

1.	//Test 018b -> single category dashboard page set multiple products ("Floor Cleaner") addition to check out test method (as a guest)
2.	//Test 018c -> single category dashboard page set multiple products ("Openhouse No. 3") addition to check out test method (as a registered user)

//single searched product addition to check out tests

1.	//Test 019 -> single searched product ("Living with Plants") addition to check out test method (as a guest)
2.	//Test 019a -> single searched product ("Dustpan & Brush") addition to check out test method (as a registered user)

//multiple searched products addition to check out tests

1.	//Test 019b -> multiple searched products ("Orbit Terrarium (Large)") addition to check out test method (as a guest)
2.	//Test 019c -> multiple searched products ("Dustpan & Brush") addition to check out test method (as a registered user)

//add products from compare list to check out tests

1.	//Test 020 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to check out test method (as a guest)
2.	//Test 020a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to check out test method (as a registered user)

//update product quantity in shopping cart tests (guest and registered user will have the same output, so only guest branch is being tested to avoid redundancy)

1.	//Test 021 -> update products quantity in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)
2.	//Test 021a -> update products quantity (with increase button) in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)
3.	//Test 021b -> update products quantity (with decrease button) in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)

//product removal from shopping cart test (guest and registered user will have the same output, so only guest branch is being tested to avoid redundancy)

1.	//Test 022 -> product(s) removal from shopping cart test method (the modal disappears after appearing shortly after without any click involved, test has failed)


//invalid shopping cart tests (invalid shipping data addition) -> only guest branch is tested to avoid redundancy

//no singular input

1.	//Test 023 -> invalid products addition to check out test method (as a guest) - no shipping country (addition to check out wasn't aborted, test has failed)
2.	//Test 023a -> invalid products addition to check out test method (as a guest) - no shipping state (addition to check out wasn't aborted, test has failed)
3.	//Test 023b -> invalid products addition to check out test method (as a guest) - no shipping city (addition to check out wasn't aborted, test has failed)
4.	//Test 023c -> invalid products addition to check out test method (as a guest) - no shipping post code (addition to check out wasn't aborted, test has failed)

//too short singular input

1.	//Test 023d -> invalid products addition to check out test method (as a guest) - too short shipping city (1 char) (addition to check out wasn't aborted, test has failed)
2.	//Test 023e -> invalid products addition to check out test method (as a guest) - too short shipping post code (4 digits) (addition to check out wasn't aborted, test has failed)

//too long singular input

1.	//Test 023f -> invalid product addition to check out test method (as a guest) - too long shipping city (100 chars) (addition to check out wasn't aborted, test has failed)
2.	//Test 023g -> invalid product addition to check out test method (as a guest) - too long shipping post code (6 digits) (addition to check out wasn't aborted, test has failed)

//invalid singular input format

1.	//Test 023h -> invalid products addition to check out test method (as a guest) - invalid shipping city format (special symbols only) (addition to check out wasn't aborted, test has failed)
2.	//Test 023i -> invalid products addition to check out test method (as a guest) - invalid shipping post code format (special symbols only) (addition to check out wasn't aborted, test has failed)


//valid checkout tests

//single most popular product check out confirmation tests

1.	//Test 024 -> single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest)
2.	//Test 024a -> single most popular product ("Oak Cheese Grater") check out confirmation test method (as a registered user)

//multiple most popular products check out confirmation tests

1.	//Test 024b -> multiple most popular products ("Tiered Wire Basket") check out confirmation test method (as a guest)
2.	//Test 024c -> multiple most popular products ("Oak Cheese Grater") check out confirmation test method (as a registered user)

//single new product check out confirmation tests

1.	//Test 025 -> single new product ("Smith Journal 13") check out confirmation test method (as a guest)
2.	//Test 025a -> single new product ("Kinfolk Issue 16") check out confirmation test method (as a registered user)

//multiple new products check out confirmation tests

1.	//Test 025b -> multiple new products ("Smith Journal 13") check out confirmation test method (as a guest)
2.	//Test 025c -> multiple new products ("Kinfolk Issue 16") check out confirmation test method (as a registered user)

//single category dashboard page single product check out confirmation tests

1.	//Test 026 -> single category dashboard page set single product ("Canvas Laundry Cart") check out confirmation test method (as a guest)
2.	//Test 026a -> single category dashboard page set single product ("Gather Journal Issue 7") check out confirmation test method (as a registered user)

//single category dashboard page multiple products check out confirmation tests

1.	//Test 026b -> single category dashboard page set multiple products ("Floor Cleaner") check out confirmation test method (as a guest)
2.	//Test 026c -> single category dashboard page set multiple products ("Openhouse No. 3") check out confirmation test method (as a registered user)

/single searched product check out confirmation tests

1.	//Test 027 -> single searched product ("Living with Plants") check out confirmation test method (as a guest)
2.	//Test 027a -> single searched product ("Dustpan & Brush") check out confirmation test method (as a registered user)

//multiple searched products check out confirmation tests

1.	//Test 027b -> multiple searched products ("Orbit Terrarium (Large)") check out confirmation test method (as a guest)
2.	//Test 027c -> multiple searched products ("Dustpan & Brush") check out confirmation test method (as a registered user)

//add products from compare list check out confirmation tests

1.	//Test 028 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list check out confirmation test method (as a guest)
2.	//Test 028a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list check out confirmation test method (as a registered user)

//invalid guest checkout tests

//no singular input

1.	//Test 029 -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest email
2.	//Test 029a -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping country
3.	//Test 029b -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping first name
4.	//Test 029c -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping last name
5.	//Test 029d -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping address
6.	//Test 029e -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping city (the error wasn't triggered, test has failed (during manual testing, it does get triggered))
7.	//Test 029f -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping post code (the error wasn't triggered, test has failed (during manual testing, it does get triggered))
8.	//Test 029g -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping phone
9.	//Test 029h -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping state (the "Select state" option fails to be selected, test has failed)
10.	//Test 029i -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing country
11.	//Test 029j -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing first name
12.	//Test 029k -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing last name
13.	//Test 029l -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing address
14.	//Test 029m -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing city (the error wasn't triggered, test has failed(the error gets triggered during manual testing))
15.	//Test 029n -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing post code (the error wasn't triggered, test has failed(the error gets triggered during manual testing))
16.	//Test 029o -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing phone
17.	//Test 029p -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing state
18.	//Test 029q -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest credit card number
19.	//Test 029r -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest credit card expiration date
20.	//Test 029s -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest credit card name
21.	//Test 029t -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest credit card CVV number (the error wasn't triggered, test has failed)

//too short singular input

1.	//Test 029u -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest email (1 char -> name, domain) (the error wasn't triggered, test has failed)
2.	//Test 029v -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping first name (1 char) (the error wasn't triggered, test has failed)
3.	//Test 029w -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping last name (1 char) (the error wasn't triggered, test has failed)
4.	//Test 029x -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping address (3 chars) (the error wasn't triggered, test has failed)
5.	//Test 029y -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping city (1 char) (the error wasn't triggered, test has failed)
6.	//Test 029z -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping post code (4 digits) (the error wasn't triggered, test has failed)
7.	//Test 029aa -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping phone (2 digits) (the error wasn't triggered, test has failed)
8.	//Test 029ab -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing first name (1 char) (the error wasn't triggered, test has failed)
9.	//Test 029ac -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing last name (1 char) (the error wasn't triggered, test has failed)
10.	//Test 029ad -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing address (3 chars) (the error wasn't triggered, test has failed)
11.	//Test 029ae -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing city (1 char) (the error wasn't triggered, test has failed)
12.	//Test 029af -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing post code (4 digits) (the error wasn't triggered, test has failed)
13.	//Test 029ag -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing phone (4 digits) (the error wasn't triggered, test has failed)
14.	//Test 029ah -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card number (15 digits)
15.	//Test 029ai -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card expiration date (3 digits)
16.	//Test 029aj -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card name (1 char)
17.	//Test 029ak -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card CVV number (2 digits)

//too long singular input

1.	//Test 029al -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest email (100 chars -> name, domain) (the error wasn't triggered, test has failed)
2.	//Test 029am -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping first name (100 chars) (the error wasn't triggered, test has failed)
3.	//Test 029an -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping last name (100 chars) (the error wasn't triggered, test has failed)
4.	//Test 029ao -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping address (100 chars) (the error wasn't triggered, test has failed)
5.	//Test 029ap -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping city (100 chars) (the error wasn't triggered, test has failed)
6.	//Test 029aq -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping  post code (6 digits) (the error wasn't triggered, test has failed)
7.	//Test 029ar -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping phone (30 digits) (the error wasn't triggered, test has failed)
8.	//Test 029as -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing first name (100 chars) (the error wasn't triggered, test has failed)
9.	//Test 029at -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing last name (100 chars) (the error wasn't triggered, test has failed)
10.	//Test 029au -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing address (100 chars) (the error wasn't triggered, test has failed)
11.	//Test 029av -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing city (100 chars) (the error wasn't triggered, test has failed)
12.	//Test 029aw -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing post code (6 digits) (the error wasn't triggered, test has failed)
13.	//Test 029ax -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing phone (30 digits) (the error wasn't triggered, test has failed)
14.	//Test 029ay -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest credit card number (17 digits) (the error wasn't triggered, test has failed)
15.	//Test 029az -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest credit card expiration date (5 digits) (the input form doesn't allow too long input, test has passed)
16.	//Test 029aaa -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest credit card name (100 chars) (the error wasn't triggered, test has failed)
17.	//Test 029aab -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest credit card CVV number (4 digits) (the error wasn't triggered, test has failed)

//invalid singular input format

1.	//Test 029aac -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest email format (missing '@') (the error wasn't triggered, test has failed)
2.	//Test 029aad -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping first name format (special symbols only) (the error wasn't triggered, test has failed)
3.	//Test 029aae -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping last name format (special symbols only) (the error wasn't triggered, test has failed)
4.	//Test 029aaf -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping address format (special symbols only) (the error wasn't triggered, test has failed)
5.	//Test 029aag -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping city format (special symbols only) (the error wasn't triggered, test has failed)
6.	//Test 029aah -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping post code format (special symbols only) (the error wasn't triggered, test has failed)
7.	//Test 029aai -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping phone format (special symbols only) (the error wasn't triggered, test has failed)
8.	//Test 029aaj -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing first name format (special symbols only) (the error wasn't triggered, test has failed)
9.	//Test 029aak -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing last name format (special symbols only) (the error wasn't triggered, test has failed)
10.	//Test 029aal -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing address format (special symbols only) (the error wasn't triggered, test has failed)
11.	//Test 029aam -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing city format (special symbols only) (the error wasn't triggered, test has failed)
12.	//Test 029aan -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing post code format (special symbols only) (the error wasn't triggered, test has failed)
13.	//Test 029aao -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing phone format (special symbols only) (the error wasn't triggered, test has failed)
14.	//Test 029aap -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number (any other than test number)
15.	//Test 029aaq -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number format (chars only) (the input form doesn't allow strings input, test has passed)
16.	//Test 029aar -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card expiration date format (chars only)
17.	//Test 029aas -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - reversed guest credit card expiration date 
18.	//Test 029aat -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card name format (special symbols only) (the error doesn't get triggered , test has failed)
19.	//Test 029aau -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card CVV number format (chars only) (the error doesn't get triggered , test has failed)

//most popular product(s) order submission confirmation tests

1.	//Test 030-> single most popular product ("Oak Cheese Grater") order submission confirmation test method (as a registered user)
2.	//Test 030a -> multiple most popular products ("Oak Cheese Grater") order submission confirmation test method (as a registered user)

//new product(s) order submission confirmation tests

1.	//Test 031 -> single new product ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)
2.	//Test 031a -> multiple new products ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)

//single category dashboard page set product(s) order submission confirmation tests

1.	//Test 032 -> single category dashboard page set single product ("Gather Journal Issue 7") order submission confirmation test method (as a registered user)
2.	//Test 032a -> single category dashboard page set multiple products ("Openhouse No. 3") order submission confirmation test method (as a registered user)

//single searched product(s) order submission confirmation tests

1.	//Test 033 -> single searched product ("Dustpan & Brush") order submission confirmation test method (as a registered user)
2.	//Test 033a -> multiple searched products ("Dustpan & Brush") order submission confirmation test method (as a registered user)

//product(s) addition from compare list order submission confirmation tests

1.	//Test 034 -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list order submission confirmation test method (as a registered user)

//valid add product review test (available only after purchase / order confirmation)

1.	//Test 035 -> valid add review on single most popular product ("Oak Cheese Grater") test method (as a registered user) (the user cannot leave a review on the purchased item, test has failed)
2.	//Test 035a -> valid add review on single category dashboard page set single product ("Canvas Laundry Cart") test method (as a guest) (the user cannot leave a review on the purchased item, test has failed)
