<!--
* Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
-->

<%@ page import="static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL" %>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX"%>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME"%>
<%@ page import="static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isAdaptiveAuthenticationAvailable"%>
<%@ page import="static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isOrganizationManagementEnabled"%>

<jsp:scriptlet>
    session.setAttribute("authCode", request.getParameter("code"));
    session.setAttribute("sessionState", request.getParameter("session_state"));
    if(request.getParameter("state") != null) {session.setAttribute("state", request.getParameter("state"));}
</jsp:scriptlet>

<!DOCTYPE HTML>
<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <meta name="referrer" content="no-referrer" />

        <link href="/console/libs/themes/default/theme.2857d6ef.min.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" href="/console/libs/themes/default/assets/images/branding/favicon.ico" />

        <script>
            var contextPathGlobal = "/console";
            var serverOriginGlobal = "<%=getServerURL("", true, true)%>";
            var superTenantGlobal = "<%=SUPER_TENANT_DOMAIN_NAME%>";
            var tenantPrefixGlobal = "<%=TENANT_AWARE_URL_PREFIX%>";
            var isAdaptiveAuthenticationAvailable = JSON.parse("<%= isAdaptiveAuthenticationAvailable() %>");
            var isOrganizationManagementEnabled = JSON.parse("<%= isOrganizationManagementEnabled() %>");
        </script>

        <script>

            var userAccessedPath = sessionStorage.getItem("userAccessedPath");
            var isSilentSignInDisabled = userAccessedPath.includes("disable_silent_sign_in") ||
                                            window.location.href.includes("disable_silent_sign_in");
            var isInviteUserFlow = userAccessedPath.includes("invite_user");
            var isApplicationsPath = userAccessedPath.includes("develop/applications") ||
                                        window.location.href.includes("develop/applications");

            if(isInviteUserFlow) {
                window.location.href = window.location.origin;
            }
        </script>

    <script defer src="/console/static/js/single.d55eb1a4.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/4112.971fc1da.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/init.43cc34ed.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/4893.2e2e7a6f.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/3904.ecf20f18.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/2067.54a91213.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/5300.29d883eb.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/554.90c6397c.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/4471.42796c85.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/8085.b47f2ca8.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/9183.a817a3f8.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/2723.8263079b.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/9230.02854586.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/9508.8d07211d.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/8064.f8903d1d.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/9861.d6a17c40.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/964.b5db83a8.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/159.1b89fab7.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/2196.60204537.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/1314.4d8c34d7.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/4188.ecff3d3f.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/4625.65c465f4.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/6667.fe247447.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-43dd7041.ccb9b010.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-a60d3c27.d639ab26.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-59bb748f.353491d0.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-e96e9bea.5b70d784.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-4413daa5.9ed13ba1.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-77ff4d4c.3410ea18.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-d0f7163f.c5321750.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-13992ba9.f3efb345.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-abd46beb.3445eabb.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-102ff935.ebbfd038.js?7cc70e531f38c4d1b662"></script><script defer src="/console/static/js/main-0a037d97.bc58a330.js?7cc70e531f38c4d1b662"></script></head>
    <body>
        <noscript>
            You need to enable JavaScript to run this app.
        </noscript>
        <div id="root"></div>
    </body>
</html>
