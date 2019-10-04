import Vue from 'vue'
import VueRouter from 'vue-router'
import Crm from '../views/crm/Crm.vue'
import App from "../App.vue";
import PlansAndReports from "../views/plans_and_reports/PlansAndReports.vue";
import Map from "../views/map/Map.vue";
import Help from "../views/help/Help.vue";

Vue.use(VueRouter)

const routes = [
    {path: '/crm', component: Crm},
    {path: '/plansAndReports', component: PlansAndReports},
    {path: '/map', component: Map},
    {path: '/help', component: Help},
    {path: '/', component: App},

];

export default new VueRouter({
    mode: 'history',
    routes
})