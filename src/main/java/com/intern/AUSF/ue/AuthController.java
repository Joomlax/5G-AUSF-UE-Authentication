package com.intern.AUSF.ue;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path="nausf-auth/v1/ue-authentications")
public class AuthController {


    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public List<Auth> getAuth() {
        return authService.getAuth();
    }

    @PostMapping()
    @ResponseBody
    public ResponseEntity<UEAuthenticationCtx> addAuth(@RequestBody Auth auth) throws JSONException {
        authService.addAuth(auth);



        final String uri = "http://localhost:8080/security-information/generate-auth-data";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> res = restTemplate.postForEntity(uri, new Auth(
                "à suci-0-001-001-0-0-0-000000001",
                "à 5G:mnc001.mcc001.3gppnetwork.org"
        ),String.class);

        JSONObject objJsonObject = new JSONObject(res.getBody());
        String authTypeObj = objJsonObject.getJSONObject("authType").getString("authType");
        String randObj = objJsonObject.getJSONObject("authenticationVector").getJSONObject("avEapAkaPrime").getString("rand");
        String xresStarObj = objJsonObject.getJSONObject("authenticationVector").getJSONObject("avEapAkaPrime").getString("xres");
        String autnObj = objJsonObject.getJSONObject("authenticationVector").getJSONObject("avEapAkaPrime").getString("autn");
        AuthType at = new AuthType(authTypeObj);
        Av5gAka av = new Av5gAka(randObj,xresStarObj,autnObj);
        AuthData ad = new AuthData(av);
        _links lk = new _links("href");
        UEAuthenticationCtx ueAuthenticationCtx = new UEAuthenticationCtx(
                at,
                ad,
                lk
        );

        return ResponseEntity.status(201).body(ueAuthenticationCtx);

    }

}
