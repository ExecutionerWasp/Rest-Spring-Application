<template>
    <v-app dark>
        <v-toolbar app>
            <v-btn fab small color="#1B5E20" @click="">
                <v-icon>settings</v-icon>
            </v-btn>
            <v-toolbar-title @click="actions(0)">
                <h1>Stoller Ukraine</h1>
            </v-toolbar-title>
            <v-spacer></v-spacer>

            <div v-for="button in menuButtonNames" :key="button.id">
                <v-btn class="elevation-5"
                       darck
                       large
                       :color="button.color"
                       @click="actions(button.id)">
                    <v-icon v-if="button.image !== ''" class="mr-3">
                        {{button.image}}
                    </v-icon>
                    {{button.name}}
                </v-btn>
            </div>
        </v-toolbar>
        <v-container>
            <router-view></router-view>
            <v-divider></v-divider>
        </v-container>
        <v-divider></v-divider>
        <v-footer class="pl-5">© «Stoller Ukraine» 2016</v-footer>
    </v-app>
</template>

<script>

    export default {
        name: 'Stoller',
        data() {
            return {
                menuButtonNames: [
                    {id: 1, name: "CRM", color: "#1B5E20", image: "table_chart", activity: false},
                    {id: 2, name: "Plans & Reports", color: "#1B5E20", image: "assignment_turned_in", activity: false},
                    {id: 3, name: "Map", color: "#1B5E20", image: "crop_free", activity: false},
                    {id: 4, name: "Help", color: "#1B5E20", image: "turned_in_not", activity: false},
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
                    case 3:
                        this.$router.push('/map');
                        break;
                    case 4:
                        this.$router.push('/help');
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