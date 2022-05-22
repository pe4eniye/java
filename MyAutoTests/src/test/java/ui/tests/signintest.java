{
  "id": "c0aef58c-d08f-4cd2-8b59-cc0eff6a2c60",
  "version": "2.0",
  "name": "dfg",
  "url": "https://www.linkedin.com/checkpoint/lg/sign-in-another-account",
  "tests": [{
    "id": "4cbf4d9e-b53c-40e5-9fda-e3b382bcc76d",
    "name": "Untitled",
    "commands": [{
      "id": "cf79e66d-c285-41f9-ad99-5a68ef076b2a",
      "comment": "",
      "command": "open",
      "target": "https://www.linkedin.com/checkpoint/lg/sign-in-another-account",
      "targets": [],
      "value": ""
    }, {
      "id": "b93ac71e-90c6-4643-925b-0a10cffe9e44",
      "comment": "",
      "command": "setWindowSize",
      "target": "1347x1008",
      "targets": [],
      "value": ""
    }, {
      "id": "123e1169-7b60-432b-b786-ba7b1e00fbb9",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.btn__primary--large",
      "targets": [
        ["css=.btn__primary--large", "css:finder"],
        ["xpath=//button[@type='submit']", "xpath:attributes"],
        ["xpath=//div[@id='organic-div']/form/div[3]/button", "xpath:idRelative"],
        ["xpath=//button", "xpath:position"],
        ["xpath=//button[contains(.,'Войти')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "03d17239-d1c6-4b9d-9e42-2cee21e91c50",
      "comment": "",
      "command": "click",
      "target": "css=.btn__primary--large",
      "targets": [
        ["css=.btn__primary--large", "css:finder"],
        ["xpath=//button[@type='submit']", "xpath:attributes"],
        ["xpath=//div[@id='organic-div']/form/div[3]/button", "xpath:idRelative"],
        ["xpath=//button", "xpath:position"],
        ["xpath=//button[contains(.,'Войти')]", "xpath:innerText"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "d485bebc-9087-4a99-a6e3-2640f8399b36",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["4cbf4d9e-b53c-40e5-9fda-e3b382bcc76d"]
  }],
  "urls": ["https://www.linkedin.com/"],
  "plugins": []
}