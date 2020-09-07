$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/CreateLead.feature");
formatter.feature({
  "name": "CreateLead in LeafTaps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Positive flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click the Create Lead Link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Company Name as\u003cCompany Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the First Name as\u003cFirst Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Last Name as\u003cLast Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Company Name",
        "First Name",
        "Last Name"
      ]
    },
    {
      "cells": [
        "TestLeaf",
        "Sudan",
        "Haran"
      ]
    },
    {
      "cells": [
        "TestLeaf",
        "Arun",
        "Kumar"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Positive flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click the Create Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCreateLeadLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Company Name asTestLeaf",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name asSudan",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name asHaran",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.verifyLeadCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Positive flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click the Create Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCreateLeadLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Company Name asTestLeaf",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name asArun",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name asKumar",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.verifyLeadCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Negative flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the First Name as\u003cFirst Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Last Name as\u003cLast Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Error Message",
  "keyword": "But "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name"
      ]
    },
    {
      "cells": [
        "Sudan",
        "Haran"
      ]
    },
    {
      "cells": [
        "Arun",
        "Kumar"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Negative flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the First Name asSudan",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SMGNN04\u0027, ip: \u0027192.168.43.68\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\HARIPR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51130}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 10b81a0c4664e643caac1a1b8d946a66\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat steps.TestSteps.fName(TestSteps.java:99)\r\n\tat ✽.Enter the First Name asSudan(file:src/test/java/features/CreateLead.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter the Last Name asHaran",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.verifyLeadCreation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Error Message",
  "keyword": "But "
});
formatter.match({
  "location": "TestSteps.verifyErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Negative flow to create a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the First Name asArun",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SMGNN04\u0027, ip: \u0027192.168.43.68\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\HARIPR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51161}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 36124bbce8d99c0d57a3a52bf48a0532\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat steps.TestSteps.fName(TestSteps.java:99)\r\n\tat ✽.Enter the First Name asArun(file:src/test/java/features/CreateLead.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter the Last Name asKumar",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.verifyLeadCreation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Create Lead Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Error Message",
  "keyword": "But "
});
formatter.match({
  "location": "TestSteps.verifyErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Click on Edit Leads.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Company Name as\u003cCompany Name1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the First Name as\u003cFirst Name1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Last Name as\u003cLast Name1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Edit Button",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the New Company Name\u003cNew Company Name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Lead Updation",
  "keyword": "Then "
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Company Name1",
        "First Name1",
        "Last Name1",
        "New Company Name"
      ]
    },
    {
      "cells": [
        "Intellect",
        "Badri",
        "Nath",
        "Adobe"
      ]
    },
    {
      "cells": [
        "FSS",
        "Gowri",
        "Shankar",
        "DTCC"
      ]
    },
    {
      "cells": [
        "FSS",
        "Prashanth",
        "N",
        "BNPP"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on Edit Leads.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Company Name asIntellect",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name asBadri",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name asNath",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Click on the Find Lead Button] is defined with 1 parameters at \u0027steps.TestSteps.findButton(String) in file:/D:/Hari%20Docs/JavaSelenium/BDD/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Click on the Find Lead Button\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(Unknown Source)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Edit Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.EditButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the New Company NameAdobe",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.NewCompName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Lead Updation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.LeadUpdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on Edit Leads.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Company Name asFSS",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name asGowri",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name asShankar",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Click on the Find Lead Button] is defined with 1 parameters at \u0027steps.TestSteps.findButton(String) in file:/D:/Hari%20Docs/JavaSelenium/BDD/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Click on the Find Lead Button\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(Unknown Source)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Edit Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.EditButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the New Company NameDTCC",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.NewCompName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Lead Updation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.LeadUpdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on Edit Leads.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Company Name asFSS",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name asPrashanth",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name asN",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.lName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Click on the Find Lead Button] is defined with 1 parameters at \u0027steps.TestSteps.findButton(String) in file:/D:/Hari%20Docs/JavaSelenium/BDD/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Click on the Find Lead Button\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(Unknown Source)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Edit Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.EditButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the New Company NameBNPP",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.NewCompName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Lead Updation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.LeadUpdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Duplicate Leads",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Phone Tab",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.phonetab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.PhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Click on the Find Lead Button] is defined with 1 parameters at \u0027steps.TestSteps.findButton(String) in file:/D:/Hari%20Docs/JavaSelenium/BDD/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Click on the Find Lead Button\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(Unknown Source)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Duplicate leads Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.DuplicateLeadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Lead Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.verifyLeadCreation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Merge Leads",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Merge Leads",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.MergeleadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on First Lookup Icon",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FirstLookup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Fname in lookup as Hari",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store leadID of First record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.StoreLeadID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Second Lookup icon",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.SecondLookup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name as",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.fName(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//input[@name\u003d\u0027firstName\u0027])[3]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SMGNN04\u0027, ip: \u0027192.168.43.68\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\HARIPR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51296}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1e0e0222b4d0493fb95de0d19b57cebc\n*** Element info: {Using\u003dxpath, value\u003d(//input[@name\u003d\u0027firstName\u0027])[3]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat steps.TestSteps.fName(TestSteps.java:99)\r\n\tat ✽.Enter the First Name as(file:src/test/java/features/CreateLead.feature:76)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Merge Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.MergeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Accept popup alert",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.AlertAccept()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Lead ID",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.LeadID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Lead Merge",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.LeadExist()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the chrome browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as Demosalesmanager and password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.enterCred(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the CRMSFA Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Leads Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Lead",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Email Tab",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.EmailLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email Address as hari.prasath086@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.EmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Click on the Find Lead Button] is defined with 1 parameters at \u0027steps.TestSteps.findButton(String) in file:/D:/Hari%20Docs/JavaSelenium/BDD/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Click on the Find Lead Button\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(Unknown Source)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Store leadID of First record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.StoreLeadID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the record",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.selectRecord()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Delete Button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.DeleteButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Find Lead Link",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.FindLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Lead ID",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.LeadID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Find Lead Button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.findButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the Lead Deletion",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.LeadDeleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout and close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
});