$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Testing101BG.feature");
formatter.feature({
  "line": 1,
  "name": "Functionality of changing background",
  "description": "",
  "id": "functionality-of-changing-background",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2416615500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1 User should be able to change background color to blue",
  "description": "",
  "id": "functionality-of-changing-background;1-user-should-be-able-to-change-background-color-to-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the Testing101 page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "Testing101StepDef.user_is_on_the_testing101_page()"
});
formatter.result({
  "duration": 3612306000,
  "status": "passed"
});
formatter.match({
  "location": "Testing101StepDef.set_skyBlue_background_button_exists()"
});
formatter.result({
  "duration": 2050395000,
  "status": "passed"
});
formatter.match({
  "location": "Testing101StepDef.i_click_on_the_button()"
});
formatter.result({
  "duration": 2046100100,
  "status": "passed"
});
formatter.match({
  "location": "Testing101StepDef.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 38772100,
  "status": "passed"
});
formatter.before({
  "duration": 1754122500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "2 User should be able to change background color to white",
  "description": "",
  "id": "functionality-of-changing-background;2-user-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Set white Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on the button two",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "Testing101StepDef.set_white_Background_button_exists()"
});
formatter.result({
  "duration": 2008057100,
  "status": "passed"
});
formatter.match({
  "location": "Testing101StepDef.i_click_on_the_button_two()"
});
formatter.result({
  "duration": 2055672600,
  "status": "passed"
});
formatter.match({
  "location": "Testing101StepDef.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 27863700,
  "status": "passed"
});
});