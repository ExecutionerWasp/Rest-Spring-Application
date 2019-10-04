<template>
    <v-card>
        <v-card-title>
            <h1>PLANS</h1>
        </v-card-title>
        <v-layout class="mr-3" row>
            <v-flex xs3 class="ml-3">
                <v-menu
                        ref="menu"
                        v-model="menu"
                        :close-on-content-click="false"
                        :return-value.sync="date"
                        transition="scale-transition"
                        offset-y
                        min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                        <v-text-field
                                v-model="date"
                                label="Оберіть тиждень"
                                prepend-icon="event"
                                readonly
                                v-on="on"
                        ></v-text-field>
                    </template>
                    <v-date-picker v-model="date" no-title scrollable>
                        <div class="flex-grow-1"></div>
                        <v-btn text color="primary" @click="menu = false">Cancel</v-btn>
                        <v-btn text color="primary" @click="$refs.menu.save(date)">OK</v-btn>
                    </v-date-picker>
                </v-menu>
            </v-flex>
            <v-spacer></v-spacer>
            <v-flex xs3 class="mr-3">
                <v-select
                        :items="plansDate"
                        label="Ваші плани"
                        dense
                ></v-select>
            </v-flex>
            <v-flex xs2>
                <v-btn class="mr-3" large :color="buttons[0].color" @click="onCreatePlan">
                    <v-icon class="mr-1">{{buttons[0].icon}}</v-icon>
                    Створити план
                </v-btn>
            </v-flex>
        </v-layout>
        <v-divider></v-divider>
        <v-card>
            <v-layout col>
                <v-flex xs12 row>
                    <v-card>
                        <v-data-table
                                :headers="headers"
                                :items="desserts"
                        >
                            <template slot="items" slot-scope="props">
                                <tr>
                                    <td>{{ props.item.id }}</td>
                                    <td class="text-xs-left">{{ props.item.deadline }}</td>
                                    <td class="text-xs-left">{{ props.item.company }}</td>
                                    <td class="text-xs-left">{{ props.item.taskType }}</td>
                                    <td class="text-xs-left">{{ props.item.taskSection }}</td>
                                    <td class="text-xs-left">{{ props.item.message }}</td>
                                    <td class="text-xs-left">{{ props.item.connectedWorkers }}</td>
                                    <td class="text-xs-left">{{ props.item.comment }}</td>
                                </tr>
                            </template>
                        </v-data-table>
                    </v-card>
                </v-flex>
            </v-layout>
        </v-card>
    </v-card>
</template>

<script>
    export default {
        name: "plans",
        props: {
            admin: false
        },

        data() {
            return {
                alert: false,
                name: 'Plans',
                admin: this.admin,
                date: new Date().toISOString().substr(0, 10),
                menu: false,
                modal: false,
                menu2: false,

                plansDate: [
                    "2019-10-04 ~ 2019-10-04",
                    "2019-10-05 ~ 2019-10-05",
                    "2019-10-06 ~ 2019-10-06",
                    "2019-10-07 ~ 2019-10-07",
                    "2019-10-08 ~ 2019-10-08"
                ],

                buttons: [
                    {
                        id: "create",
                        name: "Створити план",
                        icon: "add",
                        color: "blue-grey",
                        active: true,
                    }
                ],

                headers: [
                    {
                        text: 'ID',
                        align: 'left',
                        sortable: true,
                        value: 'name',
                    },
                    { text: 'Кінцевий термін', value: 'deadline' },
                    { text: 'Компанія', value: 'company' },
                    { text: 'Тип завдання', value: 'taskType' },
                    { text: 'Підрозділ завдання', value: 'taskSection' },
                    { text: 'Нагадування', value: 'message' },
                    { text: 'Залучені співробітники', value: 'connectedWorkers' },
                    { text: 'Коментар', value: 'comment' },
                ],
                desserts: [
                    {
                        id: '1',
                        deadline: 'deadline',
                        company: 'company',
                        taskType: 'taskType',
                        taskSection: 'taskSection',
                        message: 'message',
                        connectedWorkers: 'connectedWorkers',
                        comment: 'comment',
                    },
                    {
                        id: '2',
                        deadline: 'deadline',
                        company: 'company',
                        taskType: 'taskType',
                        taskSection: 'taskSection',
                        message: 'message',
                        connectedWorkers: 'connectedWorkers',
                        comment: 'comment',
                    },
                    {
                        id: '3',
                        deadline: 'deadline',
                        company: 'company',
                        taskType: 'taskType',
                        taskSection: 'taskSection',
                        message: 'message',
                        connectedWorkers: 'connectedWorkers',
                        comment: 'comment',
                    },
                    {
                        id: '4',
                        deadline: 'deadline',
                        company: 'company',
                        taskType: 'taskType',
                        taskSection: 'taskSection',
                        message: 'message',
                        connectedWorkers: 'connectedWorkers',
                        comment: 'comment',
                    }
                    ]
            }
        },

        methods: {
            onCreatePlan() {
                this.alert = true;
            }
        }
    }
</script>

<style scoped>

</style>