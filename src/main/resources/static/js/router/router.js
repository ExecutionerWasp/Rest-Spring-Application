import Vue from 'vue'
import VueRouter from 'vue-router'
import Crm from '../views/crm/Crm.vue'
import App from "../App.vue";
import PlansAndReports from "../views/PlansAndReports.vue";

Vue.use(VueRouter)

const routes = [
    {path: '/crm', component: Crm},
    {path: '/plansAndReports', component: PlansAndReports},
    {path: '/', component: App},

];

export default new VueRouter({
    mode: 'history',
    routes
})