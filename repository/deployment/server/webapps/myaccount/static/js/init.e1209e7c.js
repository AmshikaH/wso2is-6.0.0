(self.webpackChunk_wso2is_myaccount=self.webpackChunk_wso2is_myaccount||[]).push([[410],{91030:function(e,n,t){"use strict";t(94312),t(70626),t(6354),t(19295),t(65010),t(88039),t(54299),t(21854),t(1492),t(51295),t(66800),t(5311),t(56402),t(30975),t(66331),t(73452),t(99836),t(75985),t(69962),t(42916),t(29075),t(6678),t(10062),t(19558),t(60495),t(62419),t(78677),t(29883),t(39522),t(49098),t(48155),t(18411),t(48492),t(20659),t(36464),t(92203),t(54541),t(60137),t(63637),t(18073),t(2094),t(3974),t(24035),t(46706),t(25090),t(99022),t(17045),t(22805),t(19870),t(66656),t(42799),t(89439),t(83038),t(13138),t(75196),t(31953),t(34213),t(81605),t(9094),t(28108),t(40966),t(98407),t(25151),t(14498),t(97255),t(86717),t(81577),t(4331),t(59546),t(84901),t(65434),t(11553),t(32670),t(75864),t(57312),t(56066),t(3327),t(37060),t(36584),t(18247),t(36882),t(165),t(90383),t(85958),t(24657),t(77770),t(60145),t(704),t(23849),t(68406),t(75518),t(59756),t(2277),t(71673),t(70033),t(7473),t(68321),t(17983),t(91336),t(28640),t(35310),t(54713),t(49515),t(67345),t(60197),t(68725),t(65800),t(40260),t(49227),t(25735),t(19330),t(42077),t(33138),t(34934),t(30739),t(8688),t(90091),t(52741),t(99298),t(13151),t(73706),t(74843),t(36940),t(45396),t(48583),t(4633),t(24445),t(65627),t(66586),t(64699),t(56667),t(49195),t(33306),t(77701),t(67547),t(77294),t(27535),t(98244),t(93507),t(2680),t(27747),t(92929),t(81271),t(66885),t(30363),t(87793),t(59333),t(29912),t(90735),t(7959),t(89131),t(42599),t(65921),t(37901),t(87125),t(71423),t(64211),t(21595),t(2803),t(51753),t(4441),t(30315),t(25743),t(3007),t(91310),t(76909),t(30661),t(59916),t(26716),t(40913),t(59057),t(51571),t(6783),t(43374),t(81591),t(95339),t(74517),t(44667),t(50073),t(6511),t(45044),t(79514),t(3112),t(83859),t(4927),t(665),t(98721),t(59558),t(86255),t(34649),t(89186),t(43598),t(16143),t(23673),t(23753),t(37367),t(98860),t(75775),t(65392);var i=t(34167),r=t.n(i),s=t(70556);function a(e,n){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);n&&(i=i.filter((function(n){return Object.getOwnPropertyDescriptor(e,n).enumerable}))),t.push.apply(t,i)}return t}function o(e){for(var n=1;n<arguments.length;n++){var t=null!=arguments[n]?arguments[n]:{};n%2?a(Object(t),!0).forEach((function(n){p(e,n,t[n])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):a(Object(t)).forEach((function(n){Object.defineProperty(e,n,Object.getOwnPropertyDescriptor(t,n))}))}return e}function p(e,n,t){return n in e?Object.defineProperty(e,n,{value:t,enumerable:!0,configurable:!0,writable:!0}):e[n]=t,e}var l,u,g=function(){var e={},n={},t={},i="https://localhost:9443",r="${serverOrigin}",s="${tenantPrefix}",a="${userTenantDomain}",p="${superTenantDomain}";return{constructAppBaseNameForHistoryAPI:function(){return void 0!==t.appBaseNameForHistoryAPI?t.appBaseNameForHistoryAPI:this.isSaas()?"/":this.getAppBaseWithTenant()},constructAppPaths:function(e){return this.isSaas()?this.getAppBaseWithTenant()+e:e},constructRedirectURLs:function(e){return this.isSaas()?t.clientOrigin+(t.appBaseName?"/"+t.appBaseName:"")+e:t.clientOrigin+this.getTenantPath(!0)+"/"+t.appBaseName+e},getAppBase:function(){var e=this.getLocationPathWithoutTenant(),n=e.split("/");return n.length<=1?"/":2===n.length?e:"/"+this.getLocationPathWithoutTenant().split("/")[1]},getAppBaseWithTenant:function(){return this.getTenantPath(!0)+(t.appBaseName?"/"+t.appBaseName:"")},getConfig:function(){var e,n,i;if(0===Object.entries(t).length)return null;t.consoleApp&&t.consoleApp.origin&&(t.consoleAppOrigin=t.consoleApp.origin);var r=this.getTenantPath(!1),s=(null===(e=r.match(this.getSuperTenant()))||void 0===e?void 0:e.length)>0?"":r;return{consoleApp:{path:null!==(n=t.consoleApp)&&void 0!==n&&n.path?t.consoleAppOrigin+s+(null===(i=t.consoleApp)||void 0===i?void 0:i.path):null},appBase:t.appBaseName,appBaseNameForHistoryAPI:this.constructAppBaseNameForHistoryAPI(),appBaseWithTenant:this.getAppBaseWithTenant(),clientID:this.isSaas()||this.isSuperTenant()?t.clientID:t.clientID+"_"+this.getTenantName(),clientOrigin:t.clientOrigin,clientOriginWithTenant:t.clientOrigin+this.getTenantPath(!0),customServerHost:t.customServerHost,debug:t.debug,extensions:t.extensions,idpConfigs:this.resolveIdpConfigs(),isSaas:this.isSaas(),loginCallbackURL:this.constructRedirectURLs(t.loginCallbackPath),logoutCallbackURL:this.constructRedirectURLs(t.logoutCallbackPath),productVersionConfig:t.ui.productVersionConfig,routes:{home:this.constructAppPaths(t.routePaths.home),login:this.constructAppPaths(t.routePaths.login),logout:this.constructAppPaths(t.routePaths.logout)},serverOrigin:t.serverOrigin,serverOriginWithTenant:t.serverOrigin+this.getTenantPath(!0),session:t.session,superTenant:this.getSuperTenant(),superTenantProxy:this.getSuperTenantProxy(),tenant:this.isSuperTenant()?this.getSuperTenant():this.getTenantName(),tenantPath:this.getTenantPath(),tenantPrefix:this.getTenantPrefix(),ui:t.ui}},getLocationPathWithoutTenant:function(){var e=window.location.pathname,n=e.split("/");return n[1]===this.getTenantPrefix()&&n[2]===this.getTenantName(!0)?(n.splice(1,2),n.join("/")):e},getSuperTenant:function(){return e.superTenant||"carbon.super"},getSuperTenantProxy:function(){return t.superTenantProxy||this.getSuperTenant()},getTenantName:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"location"===this.getTenantResolutionStrategy();if(!e&&"id_token"===this.getTenantResolutionStrategy()&&t.tenant)return t.tenant;var n=window.location.pathname.split("/"),i=n.indexOf(this.getTenantPrefix());if(i>0){var r=n[i+1];return r||""}return""},getTenantPath:function(){var e=arguments.length>0&&void 0!==arguments[0]&&arguments[0];return(!e||this.getTenantName()!==this.getSuperTenant()&&""!==this.getTenantName())&&""!==this.getTenantName()?"/"+this.getTenantPrefix()+"/"+this.getTenantName():""},getTenantPrefix:function(){return e.tenantPrefix||"t"},getTenantResolutionStrategy:function(){return void 0!==t.tenantResolutionStrategy?t.tenantResolutionStrategy:"id_token"},init:function(r){n={consoleAppOrigin:(e=r).consoleAppOrigin||e.serverOrigin||i,accountAppOrigin:e.accountAppOrigin||e.serverOrigin||i,clientOrigin:window.location.origin,contextPath:e.contextPath,serverOrigin:e.serverOrigin||i},function(e,n){var t=new XMLHttpRequest;t.overrideMimeType("application/json"),t.open("GET",e,!1),t.send(null),404===t.status&&n(null),200===t.status&&(0===t.responseText.trim().length||""===t.responseText.trim()||"{}"===t.responseText.trim()?n(null):n(t.responseText))}((t=n).contextPath+"/deployment.config.json",(function(i){var r=JSON.parse(i);if(!{}.hasOwnProperty.call(r,"appBaseName"))throw"'appBaseName' config is missing in "+e.deploymentConfigFile;if(!{}.hasOwnProperty.call(r,"clientID"))throw"'clientID' config is missing in "+e.deploymentConfigFile;if(!{}.hasOwnProperty.call(r,"loginCallbackPath"))throw"'loginCallbackPath' config is missing in "+e.deploymentConfigFile;if(!{}.hasOwnProperty.call(r,"logoutCallbackPath"))throw"'logoutCallbackPath' config is missing in "+e.deploymentConfigFile;if(!{}.hasOwnProperty.call(r,"routePaths"))throw"'routePaths' config is missing in "+e.deploymentConfigFile;if(!{}.hasOwnProperty.call(r,"ui"))throw"'ui' config is missing in "+e.deploymentConfigFile;t=function(){for(var e=arguments.length,n=new Array(e),t=0;t<e;t++)n[t]=arguments[t];n=n||[];for(var i=1;i<n.length;i++)if(n[i])for(var r in n[i])({}).hasOwnProperty.call(n[i],r)&&(n[r]=n[i][r]);return n}({},n,JSON.parse(i))}))},isSaas:function(){return void 0===t.isSaas||t.isSaas},isSuperTenant:function(){return!(!t.tenant||t.tenant!==this.getSuperTenant())||""===this.getTenantName()},resolveIdpConfigs:function(){return o(o({serverOrigin:this.isSaas()?t.serverOrigin:t.serverOrigin+this.getTenantPath(!0)},t.idpConfigs),this.resolveURLs())},resolveURLs:function(){return{authorizeEndpointURL:t.idpConfigs&&t.idpConfigs.authorizeEndpointURL&&t.idpConfigs.authorizeEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy()),jwksEndpointURL:t.idpConfigs&&t.idpConfigs.jwksEndpointURL&&t.idpConfigs.jwksEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy()),logoutEndpointURL:t.idpConfigs&&t.idpConfigs.logoutEndpointURL&&t.idpConfigs.logoutEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy()),oidcSessionIFrameEndpointURL:t.idpConfigs&&t.idpConfigs.oidcSessionIFrameEndpointURL&&t.idpConfigs.oidcSessionIFrameEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()!==this.getSuperTenant()?this.getTenantName():this.getSuperTenantProxy()),tokenEndpointURL:t.idpConfigs&&t.idpConfigs.tokenEndpointURL&&t.idpConfigs.tokenEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy()),tokenRevocationEndpointURL:t.idpConfigs&&t.idpConfigs.tokenRevocationEndpointURL&&t.idpConfigs.tokenRevocationEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy()),wellKnownEndpointURL:t.idpConfigs&&t.idpConfigs.wellKnownEndpointURL&&t.idpConfigs.wellKnownEndpointURL.replace(r,t.serverOrigin).replace(s,this.getTenantPrefix()).replace(p,this.getSuperTenantProxy()).replace(a,this.getTenantName()?this.getTenantName():this.getSuperTenantProxy())}},updateTenantQualifiedBaseName:function(e){t.tenant=e,t.tenantPath=this.getTenantPath(),e!==this.getSuperTenant()?t.appBaseWithTenant="/"+this.getTenantPrefix()+"/"+e+"/"+t.appBaseName:t.appBaseWithTenant="/"+t.appBaseName}}}();t(81902);function c(e,n,t,i,r){if(e>=i||e===r){var s="session_timeout_warning",a=new URL(window.location.href);a&&a.searchParams&&null!==a.searchParams.get(s)&&a.searchParams.delete(s);var o=a.search,p=o+(o?"&":"?")+s+"=true";a.searchParams.append(s,"true");var l={idleTimeout:i,idleWarningTimeout:r,url:a.href};window.history.pushState(l,null,p),dispatchEvent(new MessageEvent("session-timeout",{data:l}))}return n}window.AppUtils&&null!==(l=window.AppUtils)&&void 0!==l&&l.getConfig()||(g.init({consoleAppOrigin:void 0,contextPath:contextPathGlobal,serverOrigin:serverOriginGlobal,superTenant:superTenantGlobal,tenantPrefix:tenantPrefixGlobal}),window.AppUtils=g);var h=null===(u=window.AppUtils)||void 0===u?void 0:u.getConfig(),f=600;null!=(null===h||void 0===h?void 0:h.session)&&null!=h.session.userIdleTimeOut&&h.session.userIdleTimeOut>1&&(f=h.session.userIdleTimeOut);var d=580;null!=(null===h||void 0===h?void 0:h.session)&&null!=h.session.userIdleWarningTimeOut&&h.session.userIdleWarningTimeOut>1&&(d=h.session.userIdleWarningTimeOut);null!=(null===h||void 0===h?void 0:h.session)&&null!=h.session.sessionRefreshTimeOut&&h.session.sessionRefreshTimeOut>1&&h.session.sessionRefreshTimeOut;var T=0,m=0;(document.onclick=function(){T=0},document.onmousemove=function(){T=0},document.onkeypress=function(){T=0},"IE"===(new s.UAParser).getBrowser().name)?window.setInterval((function(){T++,m++,m=c(T,m,0,f,d)}),1e3):(new(r())).onmessage=function(){T++,m++,m=c(T,m,0,f,d)}},34167:function(e,n,t){e.exports=function(){return t(26864)('!function(){"use strict";var e=self;setInterval((function(){e.postMessage("")}),1e3)}();',t.p+"4d36d93761e44b52a6c5.worker.js")}}},function(e){var n=function(n){return e(e.s=n)};e.O(0,[26,209],(function(){return n(85466),n(91030)}));e.O()}]);