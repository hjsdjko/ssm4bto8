(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/xueshengziliao/add-or-update"],{"0e59":function(e,n,r){},"50da":function(e,n,r){"use strict";r.r(n);var i=r("74bd"),a=r.n(i);for(var t in i)"default"!==t&&function(e){r.d(n,e,(function(){return i[e]}))}(t);n["default"]=a.a},"74bd":function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var i=a(r("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function t(e,n,r,i,a,t,u){try{var o=e[t](u),c=o.value}catch(s){return void r(s)}o.done?n(c):Promise.resolve(c).then(i,a)}function u(e){return function(){var n=this,r=arguments;return new Promise((function(i,a){var u=e.apply(n,r);function o(e){t(u,i,a,o,c,"next",e)}function c(e){t(u,i,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("2666"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{cross:"",ruleForm:{ziliaomingcheng:"",ziliaowenjian:"",ziliaoneirong:"",shangchuanshijian:"",xuehao:"",xingming:"",xingbie:"",xuexiao:"",xueyuan:"",banji:"",nianji:"",userid:""},user:{},ro:{ziliaomingcheng:!1,ziliaowenjian:!1,ziliaoneirong:!1,shangchuanshijian:!1,xuehao:!1,xingming:!1,xingbie:!1,xuexiao:!1,xueyuan:!1,banji:!1,nianji:!1,userid:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var r=this;return u(i.default.mark((function a(){var t,u,o,c;return i.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return r.ruleForm.shangchuanshijian=r.$utils.getCurDateTime(),t=e.getStorageSync("nowTable"),a.next=4,r.$api.session(t);case 4:if(u=a.sent,r.user=u.data,r.ruleForm.xuehao=r.user.xuehao,r.ro.xuehao=!0,r.ruleForm.xingming=r.user.xingming,r.ro.xingming=!0,r.ruleForm.xingbie=r.user.xingbie,r.ro.xingbie=!0,r.ruleForm.xuexiao=r.user.xuexiao,r.ro.xuexiao=!0,r.ruleForm.xueyuan=r.user.xueyuan,r.ro.xueyuan=!0,r.ruleForm.banji=r.user.banji,r.ro.banji=!0,r.ruleForm.nianji=r.user.nianji,r.ro.nianji=!0,r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=28;break}return r.ruleForm.id=n.id,a.next=26,r.$api.info("xueshengziliao",r.ruleForm.id);case 26:u=a.sent,r.ruleForm=u.data;case 28:if(r.cross=n.cross,!n.cross){a.next=84;break}o=e.getStorageSync("crossObj"),a.t0=i.default.keys(o);case 32:if((a.t1=a.t0()).done){a.next=84;break}if(c=a.t1.value,"ziliaomingcheng"!=c){a.next=38;break}return r.ruleForm.ziliaomingcheng=o[c],r.ro.ziliaomingcheng=!0,a.abrupt("continue",32);case 38:if("ziliaowenjian"!=c){a.next=42;break}return r.ruleForm.ziliaowenjian=o[c],r.ro.ziliaowenjian=!0,a.abrupt("continue",32);case 42:if("ziliaoneirong"!=c){a.next=46;break}return r.ruleForm.ziliaoneirong=o[c],r.ro.ziliaoneirong=!0,a.abrupt("continue",32);case 46:if("shangchuanshijian"!=c){a.next=50;break}return r.ruleForm.shangchuanshijian=o[c],r.ro.shangchuanshijian=!0,a.abrupt("continue",32);case 50:if("xuehao"!=c){a.next=54;break}return r.ruleForm.xuehao=o[c],r.ro.xuehao=!0,a.abrupt("continue",32);case 54:if("xingming"!=c){a.next=58;break}return r.ruleForm.xingming=o[c],r.ro.xingming=!0,a.abrupt("continue",32);case 58:if("xingbie"!=c){a.next=62;break}return r.ruleForm.xingbie=o[c],r.ro.xingbie=!0,a.abrupt("continue",32);case 62:if("xuexiao"!=c){a.next=66;break}return r.ruleForm.xuexiao=o[c],r.ro.xuexiao=!0,a.abrupt("continue",32);case 66:if("xueyuan"!=c){a.next=70;break}return r.ruleForm.xueyuan=o[c],r.ro.xueyuan=!0,a.abrupt("continue",32);case 70:if("banji"!=c){a.next=74;break}return r.ruleForm.banji=o[c],r.ro.banji=!0,a.abrupt("continue",32);case 74:if("nianji"!=c){a.next=78;break}return r.ruleForm.nianji=o[c],r.ro.nianji=!0,a.abrupt("continue",32);case 78:if("userid"!=c){a.next=82;break}return r.ruleForm.userid=o[c],r.ro.userid=!0,a.abrupt("continue",32);case 82:a.next=32;break;case 84:r.styleChange();case 85:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},shangchuanshijianConfirm:function(e){console.log(e),this.ruleForm.shangchuanshijian=e.result,this.$forceUpdate()},ziliaowenjianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.ziliaowenjian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(i.default.mark((function r(){var a,t,u,o,c,s,l,f,g,x;return i.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!n.cross){r.next=16;break}if(o=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==o){r.next=16;break}if(s=e.getStorageSync("crossObj"),o.startsWith("[")){r.next=12;break}for(l in s)l==o&&(s[l]=c);return f=e.getStorageSync("crossTable"),r.next=10,n.$api.update("".concat(f),s);case 10:r.next=16;break;case 12:a=Number(e.getStorageSync("userid")),t=s["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 16:if(!t||!a){r.next=38;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=t,g={page:1,limit:10,crossuserid:a,crossrefid:t},r.next=22,n.$api.list("xueshengziliao",g);case 22:if(x=r.sent,!(x.data.total>=u)){r.next=28;break}return n.$utils.msg(e.getStorageSync("tips")),r.abrupt("return",!1);case 28:if(!n.ruleForm.id){r.next=33;break}return r.next=31,n.$api.update("xueshengziliao",n.ruleForm);case 31:r.next=35;break;case 33:return r.next=35,n.$api.add("xueshengziliao",n.ruleForm);case 35:n.$utils.msgBack("提交成功");case 36:r.next=46;break;case 38:if(!n.ruleForm.id){r.next=43;break}return r.next=41,n.$api.update("xueshengziliao",n.ruleForm);case 41:r.next=45;break;case 43:return r.next=45,n.$api.add("xueshengziliao",n.ruleForm);case 45:n.$utils.msgBack("提交成功");case 46:case"end":return r.stop()}}),r)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),i=n.getMonth()+1,a=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),i=i>9?i:"0"+i,a=a>9?a:"0"+a,"".concat(r,"-").concat(i,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,r("543d")["default"])},"822b":function(e,n,r){"use strict";r.r(n);var i=r("f13c"),a=r("50da");for(var t in a)"default"!==t&&function(e){r.d(n,e,(function(){return a[e]}))}(t);r("ecb3");var u,o=r("f0c5"),c=Object(o["a"])(a["default"],i["b"],i["c"],!1,null,"352436b6",null,!1,i["a"],u);n["default"]=c.exports},"9ab5":function(e,n,r){"use strict";(function(e){r("ec13");i(r("66fd"));var n=i(r("822b"));function i(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},ecb3:function(e,n,r){"use strict";var i=r("0e59"),a=r.n(i);a.a},f13c:function(e,n,r){"use strict";r.d(n,"b",(function(){return a})),r.d(n,"c",(function(){return t})),r.d(n,"a",(function(){return i}));var i={wPicker:function(){return Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(r.bind(null,"2666"))}},a=function(){var e=this,n=e.$createElement;e._self._c},t=[]}},[["9ab5","common/runtime","common/vendor"]]]);