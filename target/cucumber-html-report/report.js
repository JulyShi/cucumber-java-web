$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Search in Baidu website",
  "description": "",
  "id": "search-in-baidu-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3742854535,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search in Baidu website",
  "description": "",
  "id": "search-in-baidu-website;search-in-baidu-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open baidu website and validate the title",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I input \"Selenium\" and search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the search result displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BaiDu_StepDefinitions.i_open_website()"
});
formatter.result({
  "duration": 117940933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 9
    }
  ],
  "location": "BaiDu_StepDefinitions.i_input_keyword_and_search(String)"
});
formatter.result({
  "duration": 321279967,
  "status": "passed"
});
formatter.match({
  "location": "BaiDu_StepDefinitions.the_search_result_page_displayed()"
});
formatter.result({
  "duration": 23664,
  "status": "passed"
});
formatter.after({
  "duration": 89413,
  "status": "passed"
});
});