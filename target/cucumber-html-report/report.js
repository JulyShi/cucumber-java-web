$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/qunar_test.feature");
formatter.feature({
  "line": 1,
  "name": "Search in qunar website",
  "description": "",
  "id": "search-in-qunar-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10012159378,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search in qunar website",
  "description": "",
  "id": "search-in-qunar-website;search-in-qunar-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@bvt"
    },
    {
      "line": 3,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open qunar website and validate the title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click \"自由行\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I input the Free Trip search page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the search result displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Qunar_StepDefinition.i_open_the_qunar_home_page()"
});
formatter.result({
  "duration": 90198705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "自由行",
      "offset": 9
    }
  ],
  "location": "Qunar_StepDefinition.i_click_button(String)"
});
formatter.result({
  "duration": 131891127,
  "status": "passed"
});
formatter.match({
  "location": "Qunar_StepDefinition.i_input_FreeTrip_search_page()"
});
formatter.result({
  "duration": 6965434585,
  "status": "passed"
});
formatter.match({
  "location": "Qunar_StepDefinition.the_search_result_page_dispalyed()"
});
formatter.result({
  "duration": 6730025,
  "status": "passed"
});
formatter.after({
  "duration": 171213,
  "status": "passed"
});
});