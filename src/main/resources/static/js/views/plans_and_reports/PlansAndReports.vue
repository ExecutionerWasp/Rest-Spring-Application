<template>
    <v-container class="mt-5">
        <v-layout row>
            <v-flex xs3 col>
                <v-navigation-drawer class="pr-3">
                    <v-list dance nav>
                        <v-btn v-for="button in managerButtons" :key="button.id" large block
                               :color="button.color"
                               class="ml-2 mr-2 text-lg-left" @click="onClick(button)">
                            <v-icon class="mr-3">{{button.icon}}</v-icon>
                            {{button.name}}
                            <v-spacer></v-spacer>
                        </v-btn>

                        <v-btn v-show="user.admin" v-for="button in adminButtons" :key="button.id" large block
                               :color="button.color"
                               class="ml-2 mr-2 text-lg-left" @click="onClick(button)">
                            <v-icon class="mr-3">{{button.icon}}</v-icon>
                            {{button.name}}
                            <v-spacer></v-spacer>
                        </v-btn>
                    </v-list>
                </v-navigation-drawer>
            </v-flex>
            <v-flex xs12 col>
                <plans v-if="managerButtons[0].active"></plans>
                <plans v-else-if="user.admin && adminButtons[0].active"></plans>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
    import Plans from "./Plans.vue";

    export default {
        name: "PlansAndReports",
        components: {Plans},
        data() {
            return {
                user: {
                    id: 0,
                    admin: true
                },
                managerButtons: [
                    {
                        id: "plan",
                        name: "Планування",
                        icon: "format_list_numbered",
                        color: "blue-grey",
                        active: true,
                    },
                    {
                        id: "report",
                        name: "Звітність",
                        icon: "report",
                        color: "blue-grey",
                        active: false,
                    }
                ],

                adminButtons: [
                    {
                        id: "adminPlan",
                        name: "Admin Plans",
                        icon: "format_list_numbered",
                        color: "dark",
                        active: false,
                    },
                    {
                        id: "adminReport",
                        name: "Admin Reports",
                        icon: "report",
                        color: "dark",
                        active: false,
                    }
                ]
            }
        },

        methods: {
            onClick(button) {
                this.managerButtons.forEach(btn => btn.active = false);
                this.managerButtons.forEach(btn => {
                    if (btn.id === button.id) {
                        btn.active = true;
                    }
                });

                if (this.user.admin) {
                    this.adminButtons.forEach(btn => btn.active = false);
                    this.adminButtons.forEach(btn => {
                        if (btn.id === button.id) {
                            btn.active = true;
                        }
                    })
                }
            }
        }
    }
</script>

<style scoped>

</style>