<template>
    <v-app dark>
        <v-toolbar app>
            <v-toolbar-title @click="actions(0)"><h1>Stoller Ukraine</h1></v-toolbar-title>
            <v-spacer></v-spacer>

            <div v-for="button in buttonNames" :key="button.id">
                <v-btn class="elevation-5" darck large :color="button.color" @click="actions(button.id)">{{button.name}}</v-btn>
            </div>
        </v-toolbar>
        <router-view></router-view>
        <v-divider></v-divider>
        <v-footer>FOOTER</v-footer>
    </v-app>
</template>

<script>

    export default {
        name: 'Stoller',
        data() {
            return {
                buttonNames: [
                    {id: 1, name: "CRM", color: "warning"},
                    {id: 2, name: "Plans & Reports", color: "success"}
                ],
                color: 'primary'
            }
        },

        methods: {

            actions(index) {
                switch (index) {
                    case 0:
                        this.$router.push('/');
                        break;
                    case 1:
                        this.$router.push('/crm');
                        break;
                    case 2:
                        this.$router.push('/plansAndReports');
                        break;
                    default:
                        this.$router.push('/');
                        break;
                }
            }
        }
    }
</script>
<style>

</style>