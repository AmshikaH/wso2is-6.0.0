"use strict";(self.webpackChunk_wso2is_console=self.webpackChunk_wso2is_console||[]).push([[6586],{26586:function(e,t,n){n.r(t),n.d(t,{default:function(){return q}});var a=n(8890),r=n(49227),i=n(26278),o=n(96462),s=n(68905),l=n(64805),c=n(83913),u=n(12847),d=n(50714),m=n(88742),g=n(26776),f=n(23177);function p(e){return function(e){if(Array.isArray(e))return y(e)}(e)||function(e){if("undefined"!==typeof Symbol&&null!=e[Symbol.iterator]||null!=e["@@iterator"])return Array.from(e)}(e)||b(e)||function(){throw new TypeError("Invalid attempt to spread non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function v(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=null==e?null:"undefined"!==typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==n)return;var a,r,i=[],o=!0,s=!1;try{for(n=n.call(e);!(o=(a=n.next()).done)&&(i.push(a.value),!t||i.length!==t);o=!0);}catch(e){s=!0,r=e}finally{try{o||null==n.return||n.return()}finally{if(s)throw r}}return i}(e,t)||b(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function b(e,t){if(e){if("string"===typeof e)return y(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);return"Object"===n&&e.constructor&&(n=e.constructor.name),"Map"===n||"Set"===n?Array.from(e):"Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n)?y(e,t):void 0}}function y(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,a=new Array(t);n<t;n++)a[n]=e[n];return a}var h=function(e){var t=e.organization,n=e.isReadOnly,a=e.onAttributeUpdate,r=e["data-testid"],u=(0,l.$G)().t,b=(0,c.I0)(),y=v((0,g.useTrigger)(),2),h=y[0],z=y[1],E=v((0,s.useState)(!1),2),O=E[0],A=E[1],R=(0,s.useCallback)((function(e){A(!0);var n={attributes:p(e),description:t.description,name:t.name,status:t.status};(0,d.FV)(t.id,n).then((function(e){b((0,i.addAlert)({description:u("console:manage.features.organizations.notifications.updateOrganizationAttributes.success.description"),level:m.AlertLevels.SUCCESS,message:u("console:manage.features.organizations.notifications.updateOrganizationAttributes.success.message")})),a(t.id)})).catch((function(e){null!==e&&void 0!==e&&e.description?b((0,i.addAlert)({description:e.description,level:m.AlertLevels.ERROR,message:u("console:manage.features.organizations.notifications.updateOrganizationAttributes.error.message")})):b((0,i.addAlert)({description:u("console:manage.features.organizations.notifications.updateOrganizationAttributes.genericError.description"),level:m.AlertLevels.ERROR,message:u("console:manage.features.organizations.notifications.updateOrganizationAttributes.genericError.message")}))})).finally((function(){return A(!1)}))}),[]);return s.createElement(o.EmphasizedSegment,null,s.createElement(f.Z,null,s.createElement(f.Z.Row,{columns:1},s.createElement(f.Z.Column,{tablet:16,computer:12,largeScreen:9,widescreen:6,mobile:16},s.createElement("p",null,u("console:manage.features.organizations.edit.attributes.hint")),s.createElement(o.DynamicField,{data:t.attributes,keyType:"text",keyName:u("console:manage.features.organizations.edit.attributes.key"),valueName:u("console:manage.features.organizations.edit.attributes.value"),submit:h,keyRequiredMessage:u("console:manage.features.organizations.edit.attributes.keyRequiredErrorMessage"),valueRequiredErrorMessage:u("console:manage.features.organizations.edit.attributes.valueRequiredErrorMessage"),requiredField:!0,update:R,"data-testid":"".concat(r,"-form-dynamic-field"),readOnly:n}))),!n&&s.createElement(f.Z.Row,{columns:1},s.createElement(f.Z.Column,{width:6},s.createElement(o.PrimaryButton,{onClick:function(){z()},"data-testid":"".concat(r,"-submit-button"),loading:O,disabled:O},u("common:update"))))))};h.defaultProps={"data-testid":"organization-attributes"};var z=n(23339),E=n(70787),O=n.n(E),A=n(84504),R=n(5554),S=n(58107);function w(e,t,n,a,r,i,o){try{var s=e[i](o),l=s.value}catch(e){return void n(e)}s.done?t(l):Promise.resolve(l).then(a,r)}function C(e){return function(){var t=this,n=arguments;return new Promise((function(a,r){var i=e.apply(t,n);function o(e){w(i,a,r,o,s,"next",e)}function s(e){w(i,a,r,o,s,"throw",e)}o(void 0)}))}}function L(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=null==e?null:"undefined"!==typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==n)return;var a,r,i=[],o=!0,s=!1;try{for(n=n.call(e);!(o=(a=n.next()).done)&&(i.push(a.value),!t||i.length!==t);o=!0);}catch(e){s=!0,r=e}finally{try{o||null==n.return||n.return()}finally{if(s)throw r}}return i}(e,t)||function(e,t){if(!e)return;if("string"===typeof e)return I(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);"Object"===n&&e.constructor&&(n=e.constructor.name);if("Map"===n||"Set"===n)return Array.from(e);if("Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n))return I(e,t)}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function I(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,a=new Array(t);n<t;n++)a[n]=e[n];return a}var M=function(e){var t,n=e.organization,a=e.isReadOnly,r=e.onOrganizationUpdate,u=e.onOrganizationDelete,g=e["data-testid"],p=(0,l.$G)().t,v=(0,c.I0)(),b=["name","description"],y=L((0,s.useState)(!1),2),h=y[0],E=y[1],w=L((0,s.useState)(!1),2),I=w[0],M=w[1],k=(0,s.useCallback)(function(){var e=C(regeneratorRuntime.mark((function e(t){var a;return regeneratorRuntime.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:E(!0),a=Object.keys(t).filter((function(e){return b.includes(e)})).map((function(e){return{operation:"REPLACE",path:"/".concat(e),value:t[e]}})),(0,d.Rb)(n.id,a).then((function(e){v((0,i.addAlert)({description:p("console:manage.features.organizations.notifications.updateOrganization.success.description"),level:m.AlertLevels.SUCCESS,message:p("console:manage.features.organizations.notifications.updateOrganization.success.message")})),r(n.id)})).catch((function(e){e.description?v((0,i.addAlert)({description:e.description,level:m.AlertLevels.ERROR,message:p("console:manage.features.organizations.notifications.updateOrganization.error.message")})):v((0,i.addAlert)({description:p("console:manage.features.organizations.notifications.updateOrganization.genericError.description"),level:m.AlertLevels.ERROR,message:p("console:manage.features.organizations.notifications.updateOrganization.genericError.message")}))})).finally((function(){return E(!1)}));case 3:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}(),[n,E]),T=(0,s.useCallback)((function(e){(0,d.Mz)(e).then((function(){v((0,i.addAlert)({description:p("console:manage.features.organizations.notifications.deleteOrganization.success.description"),level:m.AlertLevels.SUCCESS,message:p("console:manage.features.organizations.notifications.deleteOrganization.success.message")})),M(!1),u(e)})).catch((function(e){if(e.response&&e.response.data&&e.response.data.description)return"ORG-60007"===e.response.data.code?void v((0,i.addAlert)({description:p("console:manage.features.organizations.notifications.deleteOrganizationWithSubOrganizationError",{organizationName:n.name}),level:m.AlertLevels.ERROR,message:p("console:manage.features.organizations.notifications.deleteOrganization.error.message")})):void v((0,i.addAlert)({description:e.response.data.description,level:m.AlertLevels.ERROR,message:p("console:manage.features.organizations.notifications.deleteOrganization.error.message")}));v((0,i.addAlert)({description:p("console:manage.features.organizations.notifications.deleteOrganization.genericError.description"),level:m.AlertLevels.ERROR,message:p("console:manage.features.organizations.notifications.deleteOrganization.genericError.message")}))})).finally((function(){return M(!1)}))}),[n]),x=function(){var e=C(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return n={},null!==t&&void 0!==t&&t.name&&(t.name.length<S.H8||(null===t||void 0===t?void 0:t.name.length)>S.Xf)&&(n.name="Organization name length should be at least ".concat(S.H8," ")+"and at most ".concat(S.Xf," characters")),null!==t&&void 0!==t&&t.description&&((null===t||void 0===t?void 0:t.description.length)>S.yt||(null===t||void 0===t?void 0:t.description.length)<S.nq)&&(n.description="Organization description length should be at least \n            ".concat(S.nq," and at most ").concat(S.yt," characters")),e.abrupt("return",n);case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}();return n?s.createElement(o.EmphasizedSegment,{padded:"very"},s.createElement(f.Z,null,s.createElement(f.Z.Row,{columns:1},s.createElement(f.Z.Column,{width:8},s.createElement(z.l0,{"data-testid":"".concat(g,"-form"),onSubmit:k,uncontrolledForm:!1,validate:x},(null===n||void 0===n?void 0:n.name)&&s.createElement(z.gN.Input,{"data-testid":"".concat(g,"-overview-form-name-input"),name:"name",label:p("console:manage.features.organizations.edit.fields.name.label"),required:!0,requiredErrorMessage:"Please enter the organization name",value:n.name,ariaLabel:p("console:manage.features.organizations.edit.fields.name.ariaLabel"),placeholder:p("console:manage.features.organizations.edit.fields.name.placeholder"),inputType:"name",maxLength:S.Xf,minLength:S.H8}),s.createElement(z.gN.Textarea,{"data-testid":"".concat(g,"-overview-form-description-input"),name:"description",label:p("console:manage.features.organizations.edit.fields.description.label"),required:!1,requiredErrorMessage:"",value:null!==(t=null===n||void 0===n?void 0:n.description)&&void 0!==t?t:"",placeholder:p("console:manage.features.organizations.edit.fields.description.placeholder"),ariaLabel:p("console:manage.features.organizations.edit.fields.description.ariaLabel"),inputType:"description",maxLength:S.yt,minLength:S.nq}),(null===n||void 0===n?void 0:n.domain)&&s.createElement(z.gN.Input,{"data-testid":"".concat(g,"-overview-form-domain-input"),name:"domain",label:p("console:manage.features.organizations.edit.fields.domain.label"),required:!1,requiredErrorMessage:"",value:(null===n||void 0===n?void 0:n.domain)||"",readOnly:!0,ariaLabel:p("console:manage.features.organizations.edit.fields.domain.ariaLabel"),inputType:"url",maxLength:32,minLength:3}),(null===n||void 0===n?void 0:n.created)&&s.createElement(z.gN.Input,{"data-testid":"".concat(g,"-overview-form-created-input"),name:"created",label:p("console:manage.features.organizations.edit.fields.created.label"),required:!1,requiredErrorMessage:"",type:"text",readOnly:!0,value:O()(n.created).format("YYYY-MM-DD hh:mm:ss"),ariaLabel:p("console:manage.features.organizations.edit.fields.created.ariaLabel"),inputType:"default",maxLength:32,minLength:3}),(null===n||void 0===n?void 0:n.lastModified)&&s.createElement(z.gN.Input,{"data-testid":"".concat(g,"-overview-form-last-modified-input"),name:"lastModified",label:p("console:manage.features.organizations.edit.fields.lastModified.label"),required:!1,requiredErrorMessage:"",type:"text",readOnly:!0,value:O()(n.lastModified).format("YYYY-MM-DD hh:mm:ss"),ariaLabel:p("console:manage.features.organizations.edit.fields.lastModified.ariaLabel"),inputType:"default",maxLength:32,minLength:3}),s.createElement(f.Z.Row,{columns:1},s.createElement(f.Z.Column,{mobile:16,tablet:16,computer:8},!a&&s.createElement(A.Z,{"data-testid":"".concat(g,"-form-update-button"),primary:!0,type:"submit",size:"small",className:"form-button",loading:h,disabled:h},p("common:update")))))))),s.createElement(R.Z,{hidden:!0}),!a&&s.createElement(o.DangerZoneGroup,{sectionHeader:p("common:dangerZone")},s.createElement(o.DangerZone,{actionTitle:p("console:manage.features.organizations.edit.dangerZone.title"),header:p("common:dangerZone"),subheader:p("console:manage.features.organizations.edit.dangerZone.subHeader"),onActionClick:function(){return M(!I)},"data-testid":"".concat(g,"-role-danger-zone")})),I&&s.createElement(o.ConfirmationModal,{onClose:function(){return M(!1)},type:"negative",open:I,assertionHint:p("console:manage.features.organizations.confirmations.deleteOrganization.assertionHint"),assertionType:"checkbox",primaryAction:"Confirm",secondaryAction:"Cancel",onSecondaryActionClick:function(){return M(!1)},onPrimaryActionClick:function(){return T(n.id)},"data-testid":"".concat(g,"-role-confirmation-modal"),closeOnDimmerClick:!1},s.createElement(o.ConfirmationModal.Header,null,p("console:manage.features.organizations.confirmations.deleteOrganization.header")),s.createElement(o.ConfirmationModal.Message,{attached:!0,negative:!0},p("console:manage.features.organizations.confirmations.deleteOrganization.message")),s.createElement(o.ConfirmationModal.Content,null,p("console:manage.features.organizations.confirmations.deleteOrganization.content")))):s.createElement(o.ContentLoader,{dimmer:!0})};M.defaultProps={"data-testid":"organization-overview"};var k=function(e){var t=e.organization,n=e.isReadOnly,a=e.onOrganizationUpdate,r=e.onOrganizationDelete,i=(0,l.$G)().t;return s.createElement(o.ResourceTab,{panes:[{menuItem:i("console:manage.features.organizations.edit.tabTitles.overview"),render:function(){return s.createElement(o.ResourceTab.Pane,{controlledSegmentation:!0,attached:!1},s.createElement(M,{organization:t,isReadOnly:n,onOrganizationUpdate:a,onOrganizationDelete:r}))}},{menuItem:i("console:manage.features.organizations.edit.tabTitles.attributes"),render:function(){return s.createElement(o.ResourceTab.Pane,{controlledSegmentation:!0,attached:!1},s.createElement(h,{organization:t,isReadOnly:n,onAttributeUpdate:a}))}}]})},T=n(69626);function x(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=null==e?null:"undefined"!==typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==n)return;var a,r,i=[],o=!0,s=!1;try{for(n=n.call(e);!(o=(a=n.next()).done)&&(i.push(a.value),!t||i.length!==t);o=!0);}catch(e){s=!0,r=e}finally{try{o||null==n.return||n.return()}finally{if(s)throw r}}return i}(e,t)||function(e,t){if(!e)return;if("string"===typeof e)return Z(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);"Object"===n&&e.constructor&&(n=e.constructor.name);if("Map"===n||"Set"===n)return Array.from(e);if("Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n))return Z(e,t)}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function Z(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,a=new Array(t);n<t;n++)a[n]=e[n];return a}var q=function(e){var t,n,m=e.featureConfig,g=e.location,f=(0,l.$G)().t,p=(0,c.I0)(),v=x((0,s.useState)(),2),b=v[0],y=v[1],h=x((0,s.useState)(!0),2),z=h[0],E=h[1];(0,s.useEffect)((function(){E(!(0,a.isFeatureEnabled)(null===m||void 0===m?void 0:m.organizations,S.a5.FEATURE_DICTIONARY.get("ORGANIZATION_UPDATE")))}),[m]);var O=(0,s.useCallback)((function(e){(0,d.Xu)(e).then((function(e){y(e)})).catch((function(e){null!==e&&void 0!==e&&e.description?p((0,i.addAlert)({description:e.description,level:r.QU.ERROR,message:f("console:manage.features.organizations.notifications.fetchOrganization.genericError.message")})):p((0,i.addAlert)({description:f("console:manage.features.organizations.notifications.fetchOrganization.genericError.description"),level:r.QU.ERROR,message:f("console:manage.features.organizations.notifications.fetchOrganization.genericError.message")}))}))}),[p,f]);(0,s.useEffect)((function(){var e=g.pathname.split("/"),t=e[e.length-1];O(t)}),[g,O]);var A=(0,s.useCallback)((function(){return u.m8.push(u.$x.getPaths().get("ORGANIZATIONS"))}),[u.m8]);return s.createElement(o.PageLayout,{isLoading:!1,title:null!==(t=null===b||void 0===b?void 0:b.name)&&void 0!==t?t:f("console:manage.features.organizations.title"),pageTitle:null!==(n=null===b||void 0===b?void 0:b.name)&&void 0!==n?n:f("console:manage.features.organizations.title"),description:f("console:manage.features.organizations.edit.description"),image:s.createElement(o.GenericIcon,{defaultIcon:!0,relaxed:"very",shape:"rounded",size:"x50",icon:T.w}),backButton:{"data-testid":"org-mgt-edit-org-back-button",onClick:A,text:f("console:manage.features.organizations.edit.back")},titleTextAlign:"left",bottomMargin:!1},s.createElement(k,{organization:b,isReadOnly:z,featureConfig:m,onOrganizationUpdate:O,onOrganizationDelete:A}))}}}]);